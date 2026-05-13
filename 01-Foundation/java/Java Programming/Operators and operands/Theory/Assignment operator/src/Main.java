public class Main {
   public static void main(String[] args) {
      // basic assignment
      // the right operand (5) is evaluated (literal value) and then the result of the expression is assigned to `a`
      int a = 5;
      // assignment with a more complex right operand
      // first a + 10 is evaluated and the result is assigned to b
      // note that the = operator has the smallest precedence, so the + operator is applied first
      // and it is not required to write int b = (a + 10);
      int b = a + 10;
      // multiple assignments
      // a + 11 is evaluated first, the result is assigned to b and finally the value of b is assigned to a
      a = b = a + 11;
      System.out.println("a: " + a + " b: " + b);
      // a *= b + 1 is equivalent to a = a * (b + 1)
      // and not a = a * b + 1
      a *= b + 1;
      System.out.println("a: " + a);
   }
}