public class Main {
   public static void main(String[] args) {
      // simple example
      int i = 1 + 3 * 4 - 2 - 5;
      // add the parentheses to the "1 + 3 * 4 - 2 - 5" expression
      System.out.println("/* Copy the expression with the correct parentheses */");

      // other examples that every programmer should be able to understand
      // * or / are stronger than + or -
      // operators with the same precedence are evaluated based on their left or right associativity
      // 3 + 3 * 2
      System.out.println(/* Add the result of the expression above to be printed to the console */);
      // 1 * 1 + 1 * 1
      System.out.println(/* Add the result of the expression above to be printed to the console */);
      // 1 + 1 / 1 - 1
      System.out.println(/* Add the result of the expression above to be printed to the console */);
      // same precedence, from left to right
      // 3 * 3 / 2
      System.out.println( /* Add the result of the expression above to be printed to the console */ );
      // mix between precedence and associativity (left to right)
      // 3 * 3 / 2 + 2
      System.out.println( /* Add the result of the expression above to be printed to the console */);

      // slightly more complex example
      int j = 5;
      int k = 6;
      int l = k - j++;
      // add the parentheses to the left handside "k - j++" expression
      // including the external parentheses
      System.out.println("/* Copy the expression with the correct parentheses */");

      // examples that should probably not be written this way because
      // 1. they are difficult to be interpreted
      // 2. they have side-effects that are also difficult to interpret
      i = i + (i = 5);
      // the + operation is executed first, with left associativity
      // on the left of +, i is evaluated to the value of i (6)
      // on the right of +, (i = 5) is evaluated to 5, with the
      // side effect of assigning 5 to i
      // at this stage, i equals 5 and the two operands of the + operation are
      // 6 and 5 which is evaluated to 11
      // at last, this value is assigned to i
      // rewritten with parentheses: i = (i + (i=5));
      System.out.println(/* Add the value of i to be printed to the console */);
   }
}