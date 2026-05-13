public class Main {
   public static void main(String[] args) {
      // Simple example of a for loop
      // The initialization section declares and initializes two variables i
      // and j. i and j are visible only within the loop (their scope is the
      // loop itself).
      // The condition is checked at each iteration, before executing
      // instructions in the loop.
      // The conclusion section is executed at the end of each iteration,
      // after all instructions in the body of the loop.
      // The very last value of i just before leaving the loop is thus 10.
      for (int i = 0, j = 0; i < 10; i++, j++) {
         System.out.println("Value of i and j is " + i + ", " + j);
      }

      // simple example of nested loops
      for (int i = 1; i <= 4; i++) {
         for (int j = 1; j <= 5; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}