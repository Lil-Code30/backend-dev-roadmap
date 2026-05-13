public class Main {

   /**
    * Compute the sum of the value between index a and b from the given array.
    *
    * @param array An int array
    * @param a The first index
    * @param b The second index
    * @throws IllegalArgumentException
    */
   public static int f(int[] array, int a, int b)
         throws IllegalArgumentException {
      if(/* Complete the if condition */) {
         /* Throw the exception without message */
      }
      int sum = 0;
      while(a <= b) {
         sum += array[a];
         a = a + 1;
      }
      return sum;
   }

   public static void main(String[] args) {
      int[] array = {1, 2, 3, 4, 5, 6};
      int b = array.length -1;
      for(int a = -1; a <= array.length; a++) {
         /* Try/catch block */
            System.out.println("Sum is " + f(array, a, b));
         /* Try/catch block */
            System.out.println("Error caught");
         /* Try/catch block */
      }
   }
}