import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        System.out.println("nanuk([\"1\",\"2\",\"3\",\"5\"],0,5) -> " + hunt(new ArrayList<>(Arrays.asList("1","2","3","5")), 0, 5));
        System.out.println("nanuk([\"1\",\"nanuk\",\"3\",\"5\"],0,5) -> " + hunt(new ArrayList<>(Arrays.asList("1","nanuk","3","5")), 0, 5));
        System.out.println("nanuk([\"1\",\"3\"],0,5) -> " + hunt(new ArrayList<>(Arrays.asList("1","3")), 0, 5));
        System.out.println("nanuk([\"1\",\"10\",\"3\",\"nanuk\"],2,7) -> " + hunt(new ArrayList<>(Arrays.asList("1","10","3","nanuk")), 2, 7));
        System.out.println("nanuk([\"1\",\"10\",\"3\",\"nanuk\",\"nanuk\"],2,7) -> " + hunt(new ArrayList<>(Arrays.asList("1","10","3","nanuk","nanuk")), 2, 7));
        System.out.println("nanuk([\"1\",\"10\",\"3\",\"nanuk\",\"nanuk\",\"nanuk\"],2,7) -> " + hunt(new ArrayList<>(Arrays.asList("1","10","3","nanuk","nanuk","nanuk")), 2, 7));

    }

    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {

        //Write your solution here

    }

}