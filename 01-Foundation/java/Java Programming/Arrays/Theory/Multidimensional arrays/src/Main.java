public class Main {
   public static void main(String[] args) {

      // Declaration of a byte array of dimension 2. The first index is the
      // index of the row. The second index is the index of the column
      byte[][] byteArray;

      // Initialize an array of (2 x 3) bytes
      // [ [0, 0, 0] ]
      // [ [0, 0, 0] ]
      byteArray = new byte[2][3];

      // Alternatively, one can use the shortcut syntax to declare and
      // initialize an array
      // [ [ 1, 2, 3] ]
      // [ [ 4, 5, 6] ]
      byteArray = new byte[][]{{1, 2, 3}, {4, 5, 6}};

      // This example show how to iterate over value of a two-dimensional
      // array. The length property is used to determine the number of rows
      // and cols
      System.out.println("Nbr of rows is " + byteArray.length);
      for (int i = 0; i < byteArray.length; i++) {
         System.out.println("Nbr of elements in row " + i + " is " +
               byteArray[i].length);
         for (int j = 0; j < byteArray[i].length; j++) {
            System.out.print(byteArray[i][j] + " ");
         }
         System.out.println();
      }

      // As multidimensional arrays are array of arrays, it means that each
      // "row" can have a different dimension
      byteArray = new byte[][]{{1}, {2, 3}, {4, 5, 6}};
      for (int i = 0; i < byteArray.length; i++) {
         for (int j = 0; j < byteArray[i].length; j++) {
            System.out.print(byteArray[i][j] + " ");
         }
         System.out.println();
      }

      // Example of an array with 3 dimensions. It is enough if the first
      // dimension is set at initialization time. If more dimensions are set
      // at initialization, they must be defined in the left to right order
      int[][][] intArray = new int[3][][];
      intArray = new int[3][2][];
      // intArray = new int[][3][]; // NOT possible
      // The array corresponding to the "last" dimension can be defined
      // dynamically
      for (int i = 0; i < intArray.length; i++) {
         for (int j = 0; j < intArray[i].length; j++) {
            intArray[i][j] = new int[1];
         }
      }
   }
}