package virtualThread;

import java.util.ArrayList;
import java.util.List;

public class VirtualThreadExample2 {
    public static void main(String args[]) throws InterruptedException{

        List<Thread> vThreads = new ArrayList<>();

        int vThreadCount = 10;

        for (int i = 0; i < vThreadCount; i++){
            int vThreadIndex = i;

            Thread vThread = Thread.ofVirtual().start(() -> {
                int result = 1;

                for (int j = 0; j<10; j++){
                    result  *= (j +1);
                }
                System.out.println(" Result[" + vThreadIndex + "]: " + result);
            });
            vThreads.add(vThread);
        }

        for(int k = 0; k < vThreads.size(); k++){
            vThreads.get(k).join();
        }

        System.out.println("I am the main thread");
    }
}
