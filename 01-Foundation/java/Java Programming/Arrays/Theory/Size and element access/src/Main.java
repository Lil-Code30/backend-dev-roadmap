public class Main {
   public static void main(String[] args) {
      int[] intArray = {1, 2, 3};

      // To know the size length, we use the length property
      int size = intArray.length;
      System.out.println("Array size is : " + size);

      // To access the array values, we use the symbol [] with the index
      // number. In Java, numbering goes from 0 to length - 1
      System.out.println("First value is " + intArray[0]);
      System.out.println("Second value is " + intArray[1]);
      System.out.println("Third value is " + intArray[2]);

      // The for loop is often used to go over all array values in an easy
      // manner
      for (int i = 0; i < intArray.length; i++) {
         // It's possible to change the array values
         intArray[i] = intArray[i] + 1;
         System.out.println("Value at index " + i + " is " + intArray[i]);
      }

      // Another for syntax that is clearer and can iterate over an array
      // or other data collections. Notice that we don't have the index
      // value anymore
      for (int value : intArray) {
         System.out.println("For each value is " + value);
      }

      // Accessing an element that doesn't exist generates an exception
      try {
         // Out of bound, max size is 3
         System.out.print(intArray[4]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("First exception raised " + e.getMessage());
      }
      try {
         double[] doubleArray = null;
         // No initialization yet
         System.out.print(doubleArray[0]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Second exception raised " + e.getMessage());
      }
   }
}