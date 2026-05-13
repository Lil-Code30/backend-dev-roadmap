public class Main {
   public static void main(String[] args) {
      // Declare some variables used below.
      int intValue = 1;

      // A boolean variable cannot convert to or from any type.
      // The two lines of code below each produce an error.

      // Modify the two statements for a correct implementation of the
      // expected behavior, using the ternary operator ?.

      // boolValue should be true if intValue is not zero.
      // not possible
      boolean boolValue = /* (boolean) intValue is an invalid statement: replace it by using the ternary operator */;
      System.out.println("boolValue is " + boolValue);

      // boolAsInt should be 1 if boolValue is true, 0 otherwise.
      // not possible
      int boolAsInt = /* (int) boolValue is an invalid statement: replace it by using the ternary operator */;
      System.out.println("boolAsInt is " + boolAsInt);
   }
}