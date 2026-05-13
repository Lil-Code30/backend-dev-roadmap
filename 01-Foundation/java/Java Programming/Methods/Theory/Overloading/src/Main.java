public class Main {

   public static int triple(int i) {
      return i * 3;
   }

   // Overloading possible with parameter type change.
   public static double triple(double f) {
      return f * 3;
   }

   // Overloading possible with number of parameters change.
   public static int triple(int i, int j) {
      return i * 3 + j * 3;
   }

   // Not possible because overloading doesn't care about the return type.
   /*
   public static void triple(double f) {
      return;
   }
   */

   // Not possible because overloading doesn't care about the parameters names.
   /*
   public static double triple(double g) {
      return g * 3;
   }
   */

   public static void main(String[] args) {
      System.out.println(triple(3));
      System.out.println(triple(3.0));
   }
}