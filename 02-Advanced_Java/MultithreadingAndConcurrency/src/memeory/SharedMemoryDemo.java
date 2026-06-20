package memeory;

public class SharedMemoryDemo {

    public static void main(String args[]) throws InterruptedException{

        // shared runnable
        MyRunnable runnable = new MyRunnable( 10);

        // diff thread

        Thread thread1 = new Thread(runnable, "Thread01"); // count -> 10
        Thread thread2 = new Thread(runnable, "Thread02");

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        System.out.println("I am in the main thread");

    }
}
