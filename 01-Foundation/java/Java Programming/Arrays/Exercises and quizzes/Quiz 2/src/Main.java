import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      int[] a = {1, 2, 3};
      int[] b = {4, 5, 6};
      int[] c = {7, 8, 9};
      System.out.println(a[1]);
      a = b;
      a[0] = 0;
      System.out.println(c[2]);
      c = b;
      c[2] = 8;
      b[1] = 4;
   }
}