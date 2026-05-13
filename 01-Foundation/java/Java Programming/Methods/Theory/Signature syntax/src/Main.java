public class Main {

   /* Modifiers : none
    * Type : void
    * Nom : a
    * List of parameters : none
    * Exceptions : none
    */
   void a() {
      // With void, I don't need the return key word
   }

   /* Modifiers : none
    * Type : int
    * Nom : b
    * List of parameters : none
    * Exceptions : none
    */
   int b() {
      return 0; // I need to specify a dummy return otherwise there is an error.
   }

   /* Modifiers : public static
    * Type : int
    * Nom : c
    * List of parameters : none
    * Exceptions : none
    */
   public static int c(){
      return 0;
   }

   /* Modifiers : public static
    * Type : int
    * Nom : d
    * List of parameters : int a, int b
    * Exceptions : none
    */
   public static int d(int a, int b){
      // The parameters can be used in the method's body
      return a + b;
   }

   /* Modifiers : public static
    * Type : int
    * Nom : e
    * List of parameters : int a, int b
    * Exceptions : ArithmeticException
    */
   public static int e(int a, int b) throws ArithmeticException {
      if (a + b == 0) {
         throw new ArithmeticException();
      }
      return 1 / (a - b);
   }

   public static void main(String[] args) {
      // Invocation (call) of a method
      int result = d(4, 5);
      System.out.println(result);
   }
}