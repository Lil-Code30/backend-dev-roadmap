package ch.heiafr.tic;

public class Wizard extends Person implements SpellCaster {

   public enum HOUSE {
      GRYFFINDOR,
      HUFFLEPUFF,
      RAVENCLAW,
      SLYTHERIN
   }

   private HOUSE house;
   private String followed;

   public Wizard(String first_name, String last_name, HOUSE house) {
      super(first_name, last_name);
      this.house = house;
      this.followed = "";
   }

   @Override
   public String toString() {
      if (followed.isEmpty())
         return super.toString() + String.format(" (house : %s)", house);
      else
         return super.toString() +
               String.format(" (house : %s, following : %s)", house, followed);
   }
}
