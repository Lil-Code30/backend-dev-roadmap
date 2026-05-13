package ch.heiafr.tic;

public abstract class Person {

   public enum ACTION {
      RUN,
      FIGHT,
      SWEAR
   }

   private String first_name;
   private String last_name;

   public Person(String first_name, String last_name) {
      this.first_name = nameFormatting(first_name);
      this.last_name = nameFormatting(last_name);
   }

   // WILL BE MODIFIED IN NEXT STEP WITH ENUM METHODS
   public String doAction() {
      // int action = ThreadLocalRandom.current().nextInt(0, ACTIONS.length);
      // return ACTIONS[action];
      return null;
   }

   @Override
   public String toString() {
      return first_name + " " + last_name;
   }

   private static String nameFormatting(String s) {
      return s.substring(0, 1).toUpperCase() + s.substring(1);
   }
}