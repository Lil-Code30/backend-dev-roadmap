package CompleteGuide.ExecutorServiceExamples;

import java.util.concurrent.*;

public class ExecutorWithResults {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // submit Runnable (no return value)
        Future<?> future1 = executor.submit(() -> {
            System.out.println("Task 1 running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // submit Callable (return value)
        Future<String> future2 = executor.submit(() -> {
            Thread.sleep(2000);
            return "Task 2 result";
        });

        /*
        * A Future represents the result of an asynchronous computation. Methods are provided to check if the computation is complete, to wait for its completion,
        * and to retrieve the result of the computation. The result can only be retrieved using method get when the computation has completed, blocking if necessary
        * until it is ready. Cancellation is performed by the cancel method. Additional methods are provided to determine if the task completed normally or was cancelled.
        *  Once a computation has completed, the computation cannot be cancelled. If you would like to use a Future for the sake of cancellability but not
        * provide a usable result, you can declare types of the form Future<?> and return null as a result of the underlying task.
        * */

        // Get results (blocks until complete)
        future1.get(); // waits for completion
        // get() -> Waits if necessary for at most the given time for the computation to complete,
        // and then retrieves its result, if available.
        String result = future2.get(); // Gets the return value
        System.out.println("Result: " + result);

        // with timeout
        try {
            String result2 = future2.get(1, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            System.out.println("Task timed out!");
        }

        // shutdown the executor
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
    }
}
