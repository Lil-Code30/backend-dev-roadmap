import java.util.Random;
import java.util.concurrent.TimeUnit;

interface HardComputation {
    double evaluate(long parameter);
}

public class Task {
    private static Random rnd = new Random();

    /* Modify this method so that it can receive the correct
       parameters and that it invokes one of the referenced methods */
    static double randomValue(double[] t) {
        return t[rnd.nextInt(t.length)];
    }

    static double hardComputation1(long computationTimeInSecs) {
        try {
            TimeUnit.SECONDS.sleep(computationTimeInSecs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1.0;
    }
    static double hardComputation2(long computationTimeInSecs) {
        try {
            TimeUnit.SECONDS.sleep(computationTimeInSecs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 2.0;
    }
    static double hardComputation3(long computationTimeInSecs) {
        try {
            TimeUnit.SECONDS.sleep(computationTimeInSecs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 3.0;
    }

    public static void performHardComputation(long computationTimeInSecs) {
        /* Modify the array of double to an array of references to
           HardComputation interfaces, initialized with references
           to the Task::hardComputationX methods */
        double[] t = {
        hardComputation1(computationTimeInSecs),
        hardComputation2(computationTimeInSecs),
        hardComputation3(computationTimeInSecs)
    };
        // Modify the call to randomValue() by passing the correct parameters
        double d = randomValue(t);
        System.out.println(d);
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("You must pass the computation time as argument");
            return;
        }
        long computationTimeInSecs = 0L;
        try {
            computationTimeInSecs = Long.parseLong(args[0]);

        } catch (NumberFormatException e) {
            System.out.println("Bad argument");
            e.printStackTrace();
            return;
        }
        long start = System.currentTimeMillis();
        performHardComputation(computationTimeInSecs);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Elapsed time is : " + timeElapsed + " milliseconds");
    }
}