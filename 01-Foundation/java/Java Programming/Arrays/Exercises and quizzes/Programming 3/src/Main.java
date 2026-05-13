public class Main {

   public static int countChar(char c, String[][] things) {
      int count = 0;
      /* Implement the method by traversing the bidimensional array */
      return count;
   }

   public static void main(String[] args) {
      // First call
      char c = 'i';
      System.out.println("# of " + c + " is " +
            countChar(c, new String[][]{{"lemon"}, {"lime"}}));
      // Second call
      c = 'a';
      System.out.println("# of " + c + " is " +
            countChar(c, new String[][]{{"salad", "soup"}, {"water", "coffee"}}));
      // Third call
      c = 't';
      System.out.println("# of " + c + " is " +
            countChar(c, new String[][]{{"rabbit", "bird"}, {"cat", "dog"},
                {"gecko", "turtle"}}));
   }
}