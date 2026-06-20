public class ThreadExmple6 {

    public static void main(String args[]){
        Runnable runnable = () -> {

            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running.");

            // Pause a Thread
            try{
                Thread.sleep(1000); // in milliseconds
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(threadName + " finished running.");
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
