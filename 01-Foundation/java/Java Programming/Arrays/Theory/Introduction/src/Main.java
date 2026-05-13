public class Main {
   public static void main(String[] args) {
      // Variables are used to stock prime numbers
      int first = 2;
      int second = 3;
      int third = 5;
      int fourth = 7;
      int fifth = 11;

      System.out.println("Variables are used to save prime numbers");
      System.out.println(first);
      System.out.println(second);
      System.out.println(third);
      System.out.println(fourth);
      System.out.println(fifth);

      // Array is used to stock prime numbers
      int[] primes = {2, 3, 5, 7, 11};
      System.out.println("Array is used to save prime numbers");
      for (int i = 0; i < 5; i++) {
         System.out.println(primes[i]);
      }
   }
}