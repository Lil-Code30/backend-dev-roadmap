package Synchronized;

import java.util.Scanner;

public class SyncCounterDemo {
    public static void main(String[] args){
        SyncCounter counter = new SyncCounter();
        Scanner input = new Scanner(System.in);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("How many times do you want to increment? ");
                int n = input.nextInt();

                for(int i =0; i < n; i++){
                    counter.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                counter.decrement();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("The final value of count is: " + counter.getCounter());
            }
        });

        try{
            thread1.start();
            thread1.join();

            System.out.println("The value of count after increment is: " + counter.getCounter());

            thread2.start();
            thread2.join();
            System.out.println("The value of count after decrement is: " + counter.getCounter());


            // NOTE: Final notice, if Thread.join(0 is remove from the code, the main thread
            // (i.e the current main code does not what for any other thread to finish their execution)
            thread3.start();
            thread3.join();

        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.out.println();

    }
}
