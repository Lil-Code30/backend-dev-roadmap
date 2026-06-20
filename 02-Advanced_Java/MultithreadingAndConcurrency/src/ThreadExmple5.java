public class ThreadExmple5 {
    public static void main(String args[]){

        // Note: Runnable is an interface while Thread is a class

        Runnable myRunnable = () -> {
            System.out.println("MyRunnable running");
            System.out.println("MuRunnable finished");
        };

        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}
