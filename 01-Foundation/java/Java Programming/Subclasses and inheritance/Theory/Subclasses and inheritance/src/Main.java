import ch.heiafr.tic.Car;
import ch.heiafr.tic.Truck;
import ch.heiafr.tic.Vehicle;

public class Main {
   public static void main(String[] args) {
      Vehicle v = new Vehicle("BMW");
      v.start();
      v.speedUp();
      System.out.println(v);
      // ========================================
      Car c = new Car("VW", 4);
      c.start();
      c.stop();
      System.out.println(c);
      // ========================================
      Truck t = new Truck("Renault", 50);
      t.load(10);
      t.start();
      t.speedUp();
      t.speedUp();
      System.out.println(t);
   }
}