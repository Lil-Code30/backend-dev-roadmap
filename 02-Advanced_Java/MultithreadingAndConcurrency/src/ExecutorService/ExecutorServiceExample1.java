package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample1 {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.execute(newRunnable("Task 1.0"));
        executorService.execute(newRunnable("Task 1.1"));
        executorService.execute(newRunnable("Task 1.2"));


        executorService.shutdown();
    }

    private static Runnable newRunnable(String msg){
        return new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName()  + ": " + msg);
            }
        };
    }
}
