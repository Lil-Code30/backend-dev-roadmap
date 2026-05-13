import ch.heiafr.tic.Muggle;
import ch.heiafr.tic.Person;
import ch.heiafr.tic.Wizard;

public class Main {
   public static void main(String[] args) {
      Wizard harry = new Wizard(
            "Harry", "Potter", Wizard.HOUSES[0]
      );
      System.out.println(harry);

      Person p = harry;       // Ok, a wizard is a person -> upcasting
      System.out.println(p);

      Wizard w = (Wizard) p;  // Ok because p contains a wizard -> downcasting
      System.out.println(w);

      Muggle m = (Muggle) p;  // Error ! A person isn't necessary a muggle
      System.out.println(m);
   }
}