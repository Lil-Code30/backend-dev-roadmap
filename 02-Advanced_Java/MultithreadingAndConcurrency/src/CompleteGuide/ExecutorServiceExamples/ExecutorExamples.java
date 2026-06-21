package CompleteGuide.ExecutorServiceExamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorExamples {
    // types of thread pools

    public static void main(String args[]){
        // 1. Fixed Thread Pool - exactly N threads
        ExecutorService fixedPool = Executors.newFixedThreadPool(4);
        // Use when: You have a predictable workload and want to limit concurrency

        // 2. Cached Thread Pool - creates threads as needed, reuses idle ones
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        // Use when: You have many short-lived tasks
        // Warning: Can create unlimited threads!

        // 3. Single Thread Executor - one thread, tasks execute sequentially
        ExecutorService singlePool = Executors.newSingleThreadExecutor();
        // Use when: Tasks must execute in order, no parallelism needed

        // 4. Scheduled Thread Pool - for delayed/periodic tasks
        ScheduledExecutorService scheduledPool = Executors.newScheduledThreadPool(2);
        // Use when: You need to run tasks at specific times or intervals

        // 5. Work Stealing Pool (Java 8+) - uses all available processors
        ExecutorService workStealingPool = Executors.newWorkStealingPool();
        // Use when: Tasks have varying execution times, want to maximize CPU usage
    }
}
