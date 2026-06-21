package CompleteGuide.ExecutorServiceExamples;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ImageProcessor {
    public static void main(String[] args) throws Exception {
        List<String> imageFiles = Arrays.asList("img1.jpg", "img2.jpg", "img3.jpg");

        ExecutorService executor = Executors.newWorkStealingPool();
        List<Future<byte[]>> processedImages = new ArrayList<>();

        for(String file : imageFiles){
            Future<byte[]> future = executor.submit(() -> {
                // Simulate image processing
                System.out.println("Processing " + file);
                Thread.sleep(1500);

                return ("PROCESSED_"+file).getBytes();
            });

            processedImages.add(future);
        }

        // Save all processed images
        for(Future<byte[]> future : processedImages){
            byte[] resull = future.get();
            System.out.println("saved: " + new String(resull));
        }

        executor.shutdown();
    }
}
