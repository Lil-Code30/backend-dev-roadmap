package Synchronized;

public class SyncCounter {
    private long counter = 0;

    public  void increment() {
        this.counter++;
    }

    public  void decrement() {
        this.counter--;
    }

    public  long getCounter() {
        return counter;
    }
}
