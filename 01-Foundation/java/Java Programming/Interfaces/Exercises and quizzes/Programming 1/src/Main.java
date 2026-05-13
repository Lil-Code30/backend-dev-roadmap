import ch.heiafr.tic.Follower;
import ch.heiafr.tic.Person;
import ch.heiafr.tic.Wizard;

public class Main {
   public static void main(String[] args) {
      Wizard harry = new Wizard(
            "Harry", "Potter", Wizard.HOUSES[0]
      );
      String action = harry.doAction();

      Person p = (Person) harry;
      if (p instanceof Follower) {
         ((Follower) p).follows("Dumbledore");
      }
      System.out.println(p);
      // expected output:
      // Harry Potter (house : Gryffindor, following : Dumbledore)
   }
}