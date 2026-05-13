public class Main {
   public static void main(String[] args) {
      // Literal value specified as usual
      // Literal values for the float type are suffixed with f or F
      float f1 = 35.21f;
      double d1 = 35.21;
      float f2 = 3.41e10f;
      double d2 = 3.41e10;

      // Conversions between float and double
      f1 = /* Add explicit conversion if required */ d1;
      d2 = f2;

      // Conversion from floating point to int
      /* Declare an int variable named i1 initialized with f1 */
      // The value displayed on the console is 35 (truncated)
      System.out.println("i1 is " + i1);

      // Conversion from int to float
      f1 = i1;
      // The value displayed on the console is 35.0
      System.out.println("f1 is " + f1);
   }
}