import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      // Declaration of the array
      int[] intArray;

      // Initialization of an int array of size 3
      intArray = new int[3];

      // Initialization of an int array whose size (3) is given by a variable
      int size = 3;
      intArray = new int[size];

      // Initialization of an int array of size 3 filled with the elements 1,
      // 2 and 3
      intArray = new int[]{1, 2, 3};

      // This statement is NOT possible. The new key word is necessary if the
      // array is already declared
      // intArray = { 1, 2, 3};

      // =================================================

      // Declaration and initialization of a float array of size 3
      float[] floatArray = new float[3];

      // Declaration and initialization of a float array whose size (3) is
      // given by a variable
      size = 3;
      boolean[] booleanArray = new boolean[size];

      // Declaration and initialization at the same time with the given values
      double[] doubleArray = new double[]{1.0, 2.0, 3.0};

      // Possible to create anonyme array (without name), for example as
      // parameters as a method
      f(new int[]{1, 2, 3, 4});

      // Another was to declare and initialize at the same time with the given
      // values. The new keyword is not necessary because we do the declaration
      // and initialization at the same time
      char[] charArray = {'a', 'b', 'c'};
   }

   public static void f(int[] array) {
      System.out.println(Arrays.toString(array));
   }
}