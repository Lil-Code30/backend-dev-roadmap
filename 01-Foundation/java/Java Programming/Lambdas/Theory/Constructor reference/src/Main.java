import ch.heiafr.tic.Player;

import java.util.function.Function;

public class Main {
   public static void main(String[] args) {
      // First example with String
      Function<String, String> stringFactory = String::new;
      String a = stringFactory.apply("A");
      String b = stringFactory.apply("B");
      System.out.printf("%s %s%n", a, b);
      // Second example with Player
      Function<String, Player> playerFactory = Player::new;
      Player p1 = playerFactory.apply("Toto");
      Player p2 = playerFactory.apply("Titi");
      System.out.printf("P1 name is: %s%n", p1.getName());
      System.out.printf("P1 name is: %s%n", p2.getName());
   }
}