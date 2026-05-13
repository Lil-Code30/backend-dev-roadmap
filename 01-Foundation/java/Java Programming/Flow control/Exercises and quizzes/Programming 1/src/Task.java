public class Task {
  static void checkPrime(int number) {
    for (/* complete initialization, condition and conclusion */) {
      // Hint: The modulo operator gives the remainder of the division.
      if (/* Replace condition for checking for divisibility */) {
         System.out.println(number + " is not prime since it is " +
         "divisible by " + divisor + ".");
/* Here you need to add either a break or a continue statement */
      }

      if (divisor == number-1) {
        System.out.println(number + " is prime!");
      }
    }
  }

  public static void main(String[] args) {
    checkPrime(5);
    checkPrime(143);
    checkPrime(67);
  }
}