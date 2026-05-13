import ch.heiafr.tic.Person;
import ch.heiafr.tic.SpellCaster;
import ch.heiafr.tic.Wizard;

import static ch.heiafr.tic.Wizard.HOUSE.*;

public class Main {
   public static void main(String[] args) {
      Wizard harry = new Wizard(
            "Harry",
            "Potter",
            Wizard.HOUSE.GRYFFINDOR
      );
      // Possible to use the Enum directly when explicitly imported
      Wizard drago = new Wizard(
            "Drago",
            "Malefoy",
            SLYTHERIN
      );
      System.out.println(Wizard.HOUSE.GRYFFINDOR);
      System.out.println(Person.ACTION.RUN);
      System.out.println(SpellCaster.SPELL.ACCIO);
   }
}