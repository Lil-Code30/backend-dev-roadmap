public class ThreadExmple7 {
    public static class StoppableRunnable implements Runnable{
        private boolean stopRequested = false;

        public synchronized void requestStop(){
            this.stopRequested = true;
        }

        public synchronized boolean isStopRequested() {
            return this.stopRequested;
        }
        private void sleep(long millis){
            try{
                Thread.sleep(millis);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        @Override
        public void run(){
            System.out.println("The StoppableRunnable is running");

            while(!stopRequested){
                System.out.println("...");

                this.sleep(1000);
            }

            System.out.println("The StoppableRunnable stopped");
        }
    }

    public static void main(String args[]){
        StoppableRunnable r = new StoppableRunnable();
        Thread th = new Thread(r);

        System.out.println("The StoppableRunnable Thread is starting");
        th.start();

        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("The StoppableRunnable Thread is requesting to stop");
        r.requestStop();
        System.out.println("The StoppableRunnable Thread stopped");
    }
}
