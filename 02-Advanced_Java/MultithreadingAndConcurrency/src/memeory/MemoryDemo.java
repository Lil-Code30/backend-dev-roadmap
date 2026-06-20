package memeory;

public class MemoryDemo {
    public static void main(String args[]) throws InterruptedException{

        Thread thread1 = new Thread(new MyRunnable(10), "Tread01");
        Thread thread2 = new Thread(new MyRunnable(5), "Tread02");

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        System.out.println("I am in the main thread");

    }
}
