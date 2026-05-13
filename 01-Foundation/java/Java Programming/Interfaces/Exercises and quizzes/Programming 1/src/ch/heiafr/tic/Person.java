package ch.heiafr.tic;

import java.util.concurrent.ThreadLocalRandom;

/* Write the right modifiers */ Person {
   private static final String[] ACTIONS = {
         "run", "fight", "swear"
   };

   private String first_name;
   private String last_name;

   public Person(String first_name, String last_name) {
      this.first_name = nameFormatting(first_name);
      this.last_name = nameFormatting(last_name);
   }

   public String doAction() {
      int action = ThreadLocalRandom.current().nextInt(0, ACTIONS.length);
      return ACTIONS[action];
   }

   @Override
   public String toString() {
      return first_name + " " + last_name;
   }

   private static String nameFormatting(String s) {
      return s.substring(0, 1).toUpperCase() + s.substring(1);
   }
}
