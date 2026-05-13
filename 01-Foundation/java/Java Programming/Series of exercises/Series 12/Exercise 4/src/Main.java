import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        boolean[][] t = {
                {true, true, true},
                {false, false, false},
                {true, false, false}
        };
        System.out.println(Arrays.toString(kthRow(t, 1)));
        System.out.println(Arrays.toString(kthColumn(t, 2)));
    }

    /* Implement the program based on instructions */

}