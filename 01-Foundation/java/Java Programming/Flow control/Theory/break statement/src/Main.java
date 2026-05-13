public class Main {
   public static void main(String[] args) {
      int intNumber = 0;
      int nbrOfDraws = 0;
      while (true) {
         // random returns a random number between 0.0 and 1.0
         double number = Math.random();
         intNumber = (int) (number * 10);
         nbrOfDraws++;
         if (intNumber == 5) {
            break;
         }
      }
      System.out.println("Nbr of draws is " + nbrOfDraws);
   }
}