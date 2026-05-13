package ch.heiafr.tic;

import java.util.concurrent.ThreadLocalRandom;

public class Muggle extends Person {

   private static final String[] ACTIONS = {
         "run", "fight", "swear"
   };

   public Muggle(String first_name, String last_name) {
      super(first_name, last_name);
      System.out.println("Muggle constructor");
   }

   public String doAction() {
      int action = ThreadLocalRandom.current().nextInt(0, ACTIONS.length);
      return ACTIONS[action];
   }
}
