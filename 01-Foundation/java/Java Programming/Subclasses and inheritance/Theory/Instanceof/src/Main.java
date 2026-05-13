import ch.heiafr.tic.Muggle;
import ch.heiafr.tic.Person;
import ch.heiafr.tic.Wizard;

public class Main {
   public static void main(String[] args) {
      Wizard harry = new Wizard(
            "Harry", "Potter", Wizard.HOUSES[0]
      );

      Person p = harry;

      if (p instanceof Wizard) {
         Wizard w = (Wizard) p;
         System.out.printf("%s's action : %s%n", w, w.castSpell());
      } else if (p instanceof Muggle) {
         Muggle m = (Muggle) p;
         System.out.printf("%s's action : %s%n", m, m.doAction());
      }
   }
}