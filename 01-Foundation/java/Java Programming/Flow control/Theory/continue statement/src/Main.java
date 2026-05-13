public class Main {
   public static void main(String[] args) {
      // This program prints the number 1 -> 4 and 9 -> 10
      for (int i = 1; i <= 10; ++i) {
         if (i > 4 && i < 9) {
            continue;
         }
         System.out.println(i);
      }
   }
}