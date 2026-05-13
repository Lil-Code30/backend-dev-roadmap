public class Main {
   public static void main(String[] args) {
      int intNumber = 0;
      int nbrOfDraws = 0;
      do {
         // random returns a random number between 0.0 and 1.0
         double number = Math.random();
         intNumber = (int) (number * 10);
         nbrOfDraws++;
         // instructions

      } while (intNumber != 5);
      System.out.println("Nbr of draws is " + nbrOfDraws);
   }
}