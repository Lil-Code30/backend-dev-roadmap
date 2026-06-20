public class ThreadExmple4 {
    public static void main(String args[]){

        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("MyRunnable running");
                System.out.println("MuRunnable finished");
            }
        };

        Thread myThread = new Thread(myRunnable);
        myThread.start();
    }
}
