public class Main {

   public static int compute(int a, int b) {
      int dummy = 0; // Local variable
      int c = a + b; // Local variable
      a = 1; // Value assignation to a parameter
      return c + a;
   }

   public static void main(String[] args) {
      int a = 10;
      int b = 5;
      int c = 3;
      c = compute(a, b);
      // dummy = 1; // Not possible because dummy is a local variable of compute()
      // compute(0.0, true); // Not possible because we expect int parameters
      System.out.println("a is " + a);
      System.out.println("b is " + b);
      System.out.println("c is " + c);
   }
}