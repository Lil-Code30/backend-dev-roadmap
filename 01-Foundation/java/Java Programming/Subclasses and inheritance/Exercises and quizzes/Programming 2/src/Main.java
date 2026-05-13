import ch.heiafr.tic.*;

public class Main {
   public static void main(String[] args) {
      Building b = new Building(545000, new Room[]{
            new Room(2),
            new Room(1),
            new Room(3)
      });
      System.out.println(b);

      House h = new House(950000, 2300, new Room[]{
            new Room(2),
            new Room(3),
            new Bedroom(1, 16),
            new Bedroom(1, 13),
            new Bathroom(1, true)
      });
      System.out.println(h);

      // The expected output is
      // Building with price of 545000
      // Room with 2 windows
      // Room with 1 windows
      // Room with 3 windows

      // House with price of 950000
      // Room with 2 windows
      // Room with 3 windows
      // Bedroom with 1 windows and area 16
      // Bedroom with 1 windows and area 13
      // BathRoom with 1 windows and a bathtub
      // Rent price is 2300
   }
}