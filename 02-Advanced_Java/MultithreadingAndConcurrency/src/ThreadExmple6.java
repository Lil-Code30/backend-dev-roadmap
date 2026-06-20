public class ThreadExmple6 {

    public static void main(String args[]) throws InterruptedException {
        Runnable runnable = () -> {

            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running.");

            // Pause a Thread
            try{
                Thread.sleep(5000); // in milliseconds
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(threadName + " finished running.");
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();

//        Thread thread1 = new Thread(runnable);
//        thread1.start();
//        thread.join();

        System.out.println("Testing out the join thread");
    }
}
