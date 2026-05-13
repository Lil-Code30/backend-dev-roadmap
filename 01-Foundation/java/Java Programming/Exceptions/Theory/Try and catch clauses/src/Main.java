public class Main {

   public static int div(int a, int b) throws ArithmeticException {
      return a / b;
   }

   public static int getValue(int[] array, int index)
         throws ArrayIndexOutOfBoundsException, NullPointerException {
      return array[index];
   }

   public static void main(String[] args) {
      try {
         System.out.println("Division result is : " + div(1, 1));
         // System.out.println("Division result is : " + div(1, 0));
         int[] array = {1, 2, 3};
         System.out.println("GetValue result is : " + getValue(array, 0));
         // System.out.println("GetValue result is : " + getValue(array, 3));
         // System.out.println("GetValue result is : " + getValue(null, 0));
         // double[] doubleArray = new double[-1];
      } catch (ArithmeticException e) {
         System.out.println("ArithmeticException caught");
      } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
         System.out.println("ArrayIndexOutOfBoundsException or " +
               "NullPointerException caught");
      } catch (Exception e) {
         System.out.println("Exception caught");
      }
      System.out.println("End of the program");
   }
}