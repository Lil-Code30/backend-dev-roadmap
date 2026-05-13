import ch.heiafr.tic.*;

public class Main {
   public static void main(String[] args) {
      Garden garden = new Garden(2, 3);
      garden.add(new Tomato(0.0, 0.3));
      garden.add(new Tomato(0.0, 0.2));
      garden.add(new Carrot(0.0, 0.1));
      garden.water(0.5);
      System.out.println(garden);
      garden.grow();
      System.out.println(garden);

      // Expected output
      //  [C, 0.50 l, 0.10 cm] [X, 0.00 l, 0.00 cm] [X, 0.00 l, 0.00 cm]
      //  [T, 0.50 l, 0.30 cm] [T, 0.50 l, 0.20 cm] [X, 0.00 l, 0.00 cm]

      //  [C, 0.00 l, 0.60 cm] [X, 0.00 l, 0.00 cm] [X, 0.00 l, 0.00 cm]
      //  [T, 0.20 l, 0.60 cm] [T, 0.20 l, 0.50 cm] [X, 0.00 l, 0.00 cm]
   }
}