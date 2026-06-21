package CompleteGuide;

import java.util.ArrayList;
import java.util.List;

public class FileProcessor {
    public static void main(String args[]){
        // process multiple files concurrently
        String[] files = {"data1.csv", "data2.csv", "data3.csv", "data4.csv"};

        List<Thread> threads = new ArrayList<>();

        for(String file: files){
            Thread t = new Thread(() -> {
                System.out.println("Processing " + file + " in thread: " + Thread.currentThread().getName());

                //simulate

                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }

                System.out.println("Finished processing file: " + file);
            });

            t.start();
            threads.add(t);
        }

        // wait for all thread to complete
        for(Thread t: threads){
            try{
                t.join();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("All files processed");
    }
}
