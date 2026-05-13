import ch.heiafr.tic.Muggle;
import ch.heiafr.tic.Wizard;

public class Main {
   public static void main(String[] args) {
      Muggle dudley = new Muggle("Dudley", "Dursley");
      Wizard harry = new Wizard(
            "Harry", "Potter", Wizard.HOUSES[0]
      );
      System.out.printf("%s's action : %s%n", dudley, dudley.doAction());
      System.out.printf("%s's action : %s%n", harry, harry.castSpell());
   }
}