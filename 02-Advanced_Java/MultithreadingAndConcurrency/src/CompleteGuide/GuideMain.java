package CompleteGuide;

public class GuideMain {

    public static void main(String args[]) throws InterruptedException{

        MyThread myThread = new MyThread();

        myThread.start();

        Thread thread1 = new Thread(new MyRunnable());

        thread1.start();

        // Thread Methods
        Thread worker = new Thread(() -> {
            System.out.println("worker started");
            try{
                Thread.sleep(2000); // pause for 2 seconds
            } catch(InterruptedException e){
                System.out.println("worker interrupted");
                Thread.currentThread().interrupt(); // Restore interrupt status
            }
            System.out.println("worker finished");
        });

        worker.start();

        System.out.println("Main thread waiting for worker...");
        worker.join(); //wait for worker to finish
        System.out.println("Main thread continues");

        // other useful methods
        System.out.println("Thread name: " + worker.getName());
        System.out.println("Thread priority: " + worker.getPriority());
        System.out.println("Is alive: " + worker.isAlive());
        System.out.println("Is daemon: " + worker.isDaemon());
    }
}
