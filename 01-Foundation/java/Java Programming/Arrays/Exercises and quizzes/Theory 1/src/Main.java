import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      int[] one = {1, 2, 3};
      int[][] two = { {1}, {1, 2, 3}, {1, 2, 3, 4} };
      int[][][] three = {
              { { 1, 2, 3}, { 4, 5, 6}, { 7, 8, 9} },
              { { 10, 11, 12}, { 13, 14, 15}, { 16, 17, 18} },
      };
      // One
      System.out.println(one.length);
      System.out.println(one[1]);
      // Two
      System.out.println(two.length);
      System.out.println(two[2].length);
      System.out.println(two[2].length);
      System.out.println(two[1]);
      System.out.println(two[1][2]);
      // Three
      System.out.println(three.length);
      System.out.println(three[0].length);
      System.out.println(three[0][0].length);
      System.out.println(three[1][2]);
      System.out.println(three[1][2][2]);
   }
}