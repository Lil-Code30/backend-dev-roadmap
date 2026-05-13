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
         long res = factorial(-1);
      } catch (IllegalArgumentException e) {
         System.out.println("=== Print of getMessage()");
         System.out.println(e.getMessage());
         System.out.println("=== Print of toString()");
         System.out.println(e.toString());
         System.out.println("=== Print of printStackTrace()");
         e.printStackTrace();
      }
   }
}