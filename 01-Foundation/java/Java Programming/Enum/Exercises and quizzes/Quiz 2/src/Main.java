import ch.heiafr.tic.Color;

public class Main {
   public static void main(String[] args) {
      int value = 0;
      for(Color c: Color.values()) {
         value += c.name().length();
         value -= c.ordinal();
      }
   }
}