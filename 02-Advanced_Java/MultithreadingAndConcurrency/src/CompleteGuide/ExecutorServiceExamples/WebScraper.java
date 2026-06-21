package CompleteGuide.ExecutorServiceExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class WebScraper {
    public static void main(String[] args) throws Exception {
        List<String> urls = Arrays.asList(
                "https://example.com/page1",
                "https://example.com/page2",
                "https://example.com/page3",
                "https://example.com/page4",
                "https://example.com/page5"
        );

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures = new ArrayList<>();

        //submit all scraping tasks
        for (String url: urls){
            Future<String> future = executor.submit(() -> {
               //Simulate HTTP request
                Thread.sleep((long)(Math.random() * 2000));
                return "Content from " + url;
            });

            futures.add(future);
        }

        // Collect results as they complete
        for(Future<String> future: futures){
            try{
                String content = future.get(5, TimeUnit.SECONDS);
                System.out.println("Scraped: " + content);
            }catch(InterruptedException e){
                System.out.println("Request time out");
            }
        }

        executor.shutdown();
    }
}
