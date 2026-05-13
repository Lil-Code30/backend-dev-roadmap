import ch.heifr.tic.Player;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
   public static void main(String[] args) {
      Player player = new Player("Toto");
      // play a number of moves and store the history of moves
      int index = 0;
      final int NUMBER_OF_MOVES = 5;
      final int HISTORIC_SIZE = 10;
      final int STEP_SIZE = 5;
      Player[] historic = new Player[HISTORIC_SIZE];
      Random random = new Random(1);
      for(int i = 0; i < NUMBER_OF_MOVES; i++) {
         historic[index++] = player;
         // execute a random move
         int x = random.nextInt(STEP_SIZE);
         int y = random.nextInt(STEP_SIZE);
         player = player.move(x, y);
      }
      System.out.println(Arrays.toString(historic));
   }
}