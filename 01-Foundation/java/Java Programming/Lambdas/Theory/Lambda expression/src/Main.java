import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      Integer[] t = {45, 2, 590, 19, 334};
      Arrays.sort(t, (a, b) -> a.compareTo(b));
      System.out.println(Arrays.toString(t));
      Arrays.sort(t, (a, b) -> b.compareTo(a));
      System.out.println(Arrays.toString(t));
      Arrays.sort(t, (a, b) -> (a % 10 - b % 10));
      System.out.println(Arrays.toString(t));
   }
}