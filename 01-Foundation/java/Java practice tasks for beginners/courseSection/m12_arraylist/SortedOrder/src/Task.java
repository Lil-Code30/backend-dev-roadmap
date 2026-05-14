import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 5, 5, 8, 6));
        System.out.println(isSorted(list));

        list = new ArrayList<>(List.of(0, 0, 3, 5, 8));
        System.out.println(isSorted(list));
    }

    public static boolean isSorted(ArrayList<Integer> nums) {

        //Write your solution here
    }

}