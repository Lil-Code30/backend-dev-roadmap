public class Main {
   public static void main(String[] args) {
      // Simple example of a while loop (produces the same result as
      // the previous example with the for loop).
      // While loops do not have an initialization and conclusion section.
      // In the example below, i and j are visible outside the loop: they
      // must be declared outside the loop.
      int i = 0, j = 0;
      while (i < 10) {
         System.out.println("Value of i and j is " + i + ", " + j);
         i++;
         j++;
      }
   }
}