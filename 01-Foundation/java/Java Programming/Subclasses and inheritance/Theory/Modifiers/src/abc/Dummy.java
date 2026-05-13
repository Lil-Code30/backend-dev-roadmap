package abc;

import ch.heiafr.tic.Parent;

public class Dummy extends Parent {

   @Override
   public void print() {
      // NOT POSSIBLE
      // System.out.println("Dummy value %d " + att1);
      System.out.println("Dummy value " + att2);
   }
}
