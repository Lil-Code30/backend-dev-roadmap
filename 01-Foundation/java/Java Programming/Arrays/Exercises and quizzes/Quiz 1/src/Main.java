import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      int[] a = new int[3];
      int[] b = new int[4];
      int[] c = new int[5];
      System.out.println(b.length - c.length);
      a[2] = 5;
      c[1] = 3;
      a[0] = 4;
      c[2] = 1;
      Arrays.fill(b, 2);
      System.out.println(b[0] + a[2] + c[1]);
      System.out.println(c[1] - a[1] - c[2]);
   }
}