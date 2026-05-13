public class Main {
   public static void main(String[] args) {
      int num = 8;
      String msg = "";
      if (num > 10) {
         msg = "Number is greater than 10";
      }
      else {
         msg = "Number is less than or equal to 10";
      }
      // the example above can be rewritten as
      msg = num > 10 ? "Number is greater than 10" :
              "Number is less than or equal to 10";
      System.out.println(msg);

      // Can be nested
      msg = num > 10 ? "Number is greater than 10" : num > 5 ?
              "Number is greater than to 5" : "Number is less than/equal to 5";
      System.out.println(msg);

      // Only one of the second/third operands is evaluated
      int a = 1;
      int b = 10;
      // in this example, ++b is not evaluated
      int c = a < 10 ? a++ : ++b;
      System.out.println("a: " + a + " b: " + b + " c: " + c);
   }
}