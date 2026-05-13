public class Prime {
   public static void main(String[] args) {

      // ===================================================
      // Testing if 5 is prime or not without methods
      int number = 5;
      boolean result = false;
      for (int divisor = 2; divisor < number; divisor++) {
         if (number % divisor == 0) {
            break;
         }
         if (divisor == number-1) {
            result = true;
         }
      }
      // Printing the result for 5
      if(result) {
         System.out.println(number + " is prime!");
      } else {
         System.out.println(number + " is not prime!");
      }
      // ===================================================

      // With methods -> it's easy to call several times
      printIfPrimeResult(checkIfPrime(5), 5);
      printIfPrimeResult(checkIfPrime(143), 143);
      printIfPrimeResult(checkIfPrime(67), 67);
   }

   // This method checks if the given number is prime or not.
   static boolean checkIfPrime(int number) {
      for (int divisor = 2; divisor < number; divisor++) {
         // Hint: The modulo operator gives the remainder of the division.
         if (number % divisor == 0) {
            break;
         }

         if (divisor == number-1) {
            return true;
         }
      }
      return false;
   }

   // This method print the result.
   static void printIfPrimeResult(boolean result, int number) {
      if(result) {
         System.out.println(number + " is prime!");
      } else {
         System.out.println(number + " is not prime!");
      }
   }
}