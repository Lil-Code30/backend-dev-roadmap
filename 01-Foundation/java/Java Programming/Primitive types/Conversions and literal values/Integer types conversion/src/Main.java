public class Main {
   public static void main(String[] args) {
      // conversion from a smaller to a larger type
      byte intAsByte = 8;
      /* Declare an int variable named intAsInt initialized with the value of intAsByte */

      // conversion from a larger type to a smaller type
      // not possible without type casting - range is different
      /* Add an instruction for assigning the value of intAsInt to intAsByte */
      System.out.println("intAsByte is " + intAsByte);

      // example where value is too large
      intAsInt = 512;
      intAsByte = (byte) intAsInt;
      System.out.println("intAsByte is " + /* Add the literal value that corresponds to the value of intAsByte */);

      // operations with multiple types
      intAsByte = 10;
      short intAsShort = 15;
      intAsInt = 20;
      // the expression on the right hand side is evaluated as an
      // int, no cast is required
      int sumAsInt = intAsByte + intAsShort;
      System.out.println("sumAsInt is " + sumAsInt);
      short sumAsShort = /* Assign the result of the sum (intAsByte + intAsShort) to sumAsShort */;
      System.out.println("sumAsShort is " + sumAsShort);
   }
}