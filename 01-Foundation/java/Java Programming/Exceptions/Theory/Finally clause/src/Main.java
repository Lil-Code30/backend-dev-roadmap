public class Main {

   public static long factorial(int x) throws IllegalArgumentException {
      if(x < 0) {
         throw new IllegalArgumentException("x must be >= 0");
      }
      long result = 1;
      while (x > 1) {
         result *= x;
         x--;
      }
      return result;
   }

   public static void main(String[] args) {
      try {
         System.out.println("Try block before the method");
         long res = factorial(-1);
         System.out.println("Try block after the method");
      } catch (IllegalArgumentException e) {
         System.out.println("Catch block");
      } finally {
         System.out.println("Finally block");
      }
   }
}