package virtualThread;

public class VirtualThreadExample {

    public static void main(String args[]) throws InterruptedException {
        // Ex1: Create Runnable Create and start a virtual thread
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++){
                System.out.println("Index: " + i);
            }


        };

        Thread vThread = Thread.ofVirtual().start(runnable);


        // Ex2: Create but do not start virtual thread
        Thread vThreadUnstarted = Thread.ofVirtual().unstarted(runnable);

        vThreadUnstarted.start();

        // joining a virtual thread
        vThreadUnstarted.join();

        System.out.println("Testing join thread");
    }

}
