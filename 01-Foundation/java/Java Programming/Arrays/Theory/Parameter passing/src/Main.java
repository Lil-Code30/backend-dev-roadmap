import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      int[] intArray = new int[]{1, 5, 3, 2};

      // WITHOUT side effect, intArray is left unchanged
      int max = max(intArray);
      System.out.println("Max value is " + max);

      // WITH side effect, intArray is modified;
      System.out.println();
      System.out.println("Array before modify " + Arrays.toString(intArray));
      modify(intArray);
      System.out.println("Array after modify " + Arrays.toString(intArray));

      // Note that you may also change references in multidimensional arrays
      int[][] dim2Array = new int[3][];
      System.out.println();
      System.out.println("Array before allocate " + Arrays.toString(dim2Array[0]));
      allocate(dim2Array);
      System.out.println("Array after allocate " + Arrays.toString(dim2Array[0]));

      // Cloning permits to have a different address
      int[] intArraySecond = Arrays.copyOf(intArray, intArray.length);
      System.out.println();
      System.out.println("intArray " + intArray);
      System.out.println("intArraySecond " + intArraySecond);
      // Modification of intArraySecond only
      Arrays.fill(intArraySecond, -1);
      System.out.println("intArray " + Arrays.toString(intArray));
      System.out.println("intArraySecond " + Arrays.toString(intArraySecond));
   }


   // Method WITHOUT side effect. The array passed as argument is not modified
   private static int max(int[] array) {
      int max = Integer.MIN_VALUE;
      for (int value : array) {
         if (value > max) {
            max = value;
         }
      }
      return max;
   }

   // Method WITH side effect. The array passed as argument is modified
   private static void modify(int[] array) {
      for (int i = 0; i < array.length; i++) {
         array[i]--;
      }
   }

   // Method WITH side effect. The array passed as argument is modified. In
   // particular some references are modified (allocated)
   private static void allocate(int[][] dim2Array) {
      for (int i = 0; i < dim2Array.length; i++) {
         dim2Array[i] = new int[2];
      }
   }

}