public class Main {
   public static void main(String[] args) {
      // implicit conversions
      int intVal = 8;
      long longVal = intVal + 1;  // implicit casting from int to long
      double doubleVal = longVal; // implicit casting from long to double

      // explicit conversions
      double d = 2.00003;
      long l =  (long) d; // it loses the fractional part
      int i = (int) l;    // explicit type casting required
      int val = (int) (1 + 2L + 3); // requires explicit casting because the result is long

      // overflows/underflows
      long longValue = Long.MAX_VALUE;
      int intValue = (int) longValue; // int variable can't store this value, the
      // result is -1
      longValue = (long) Integer.MAX_VALUE + 1;
      intValue = (int) longValue;
   }
}