package memeory;

public class MyRunnable implements Runnable{
    private int count = 0;
    private int limit;

    public MyRunnable(int limit){
        this.limit = limit;
    }

    @Override
    public void run(){
        for(int i = 0; i < limit; i++){
            System.out.println(Thread.currentThread().getName() + ": limit -> " + i);
            this.count++;
        }

        System.out.println(Thread.currentThread().getName() + ":  " + this.count + " counts");
    }

}
