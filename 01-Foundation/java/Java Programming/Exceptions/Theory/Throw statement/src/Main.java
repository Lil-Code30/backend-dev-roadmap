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
      // === Examples of exceptions raised by the system

      // *** ArithmeticException
      // int x = 2 / 0;

      // *** ArrayIndexOutOfBoundsException
      // int[] firstArray = {1, 2, 3};
      // int y = firstArray[3];

      // *** NullPointerException
      // int[] secondArray = null;
      // int z = secondArray[0];

      // === The key word throw is used in the method to throw the exception
      System.out.println("Factorial of 5 is : " + factorial(5));
      System.out.println("Factorial of 5 is : " + factorial(-1));
   }
}