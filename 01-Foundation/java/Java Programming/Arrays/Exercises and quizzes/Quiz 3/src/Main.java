import java.util.Arrays;

public class Main {

   public static int a(int value, int[] array) {
      return value + --array[array.length / 2];
   }

   public static int b(int[] array) {
      return array[array.length / 2];
   }

   public static int c(int[] array) {
      return array[0]++;
   }

   public static void main(String[] args) {
      int[] array = {2, 4, 6};
      int value = a(3, array);
      value += b(array);
      value += c(array.clone());
   }
}