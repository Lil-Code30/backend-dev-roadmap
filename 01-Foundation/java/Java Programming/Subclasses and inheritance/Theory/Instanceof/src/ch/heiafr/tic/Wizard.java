package ch.heiafr.tic;

import java.util.concurrent.ThreadLocalRandom;

public class Wizard extends Person {

   public static final String[] HOUSES = {
         "Gryffindor",
         "Hufflepuff",
         "Ravenclaw",
         "Slytherin"
   };

   private static final String[] SPELLS = {
         "accio", "alohomora", "bombardo", "expelliarmus"
   };

   private String house;

   public Wizard(String first_name, String last_name, String house) {
      super(first_name, last_name);
      this.house = house;
   }

   public String castSpell() {
      int spell = ThreadLocalRandom.current().nextInt(0, SPELLS.length);
      return SPELLS[spell];
   }

   @Override
   public String toString() {
      return super.toString() + String.format(" (house : %s)", house);
   }
}
