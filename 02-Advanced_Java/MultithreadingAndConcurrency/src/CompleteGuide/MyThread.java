package CompleteGuide;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Running in thread: " + Thread.currentThread().getName());
    }
}
