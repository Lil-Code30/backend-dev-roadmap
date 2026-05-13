import ch.heiafr.tic.Person;
import ch.heiafr.tic.SpellCaster;
import ch.heiafr.tic.Wizard;

public class Main {
   public static void main(String[] args) {
      // values() method
      for (Wizard.HOUSE house: Wizard.HOUSE.values()) {
         System.out.print(house + " ");
      }
      System.out.println();

      // valueOf() method
      Person.ACTION action = Person.ACTION.valueOf("RUN");
      System.out.println("Action : " + action);
      try {
         action = Person.ACTION.valueOf("Dummy");
      } catch (IllegalArgumentException e) {
         System.out.println("IllegalArgumentException catched");
      }

      // name() method
      SpellCaster.SPELL spell = SpellCaster.SPELL.ACCIO;
      String spellString = spell.name();
      System.out.println("Spell : " + spellString);

      // ordinal() method
      int position = SpellCaster.SPELL.ACCIO.ordinal();
      System.out.println("Accio position is : " + position);
   }
}