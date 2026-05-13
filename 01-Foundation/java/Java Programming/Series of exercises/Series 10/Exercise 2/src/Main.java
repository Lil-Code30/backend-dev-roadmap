import java.util.Arrays;

public class Main {
  //put your task here

    /* Implement the program based on instructions */

    public static void main(String[] args) {
        double[][] matrix = {{1,2,3},{4,5,6}};
        double[][] t =  transpose(matrix);

        System.out.println("matrix: " + Arrays.deepToString(matrix));
        System.out.println("transpose: " + Arrays.deepToString(t));
    }

}