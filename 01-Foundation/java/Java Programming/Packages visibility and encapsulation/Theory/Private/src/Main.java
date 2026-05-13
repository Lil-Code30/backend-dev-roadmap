import ch.heiafr.tic.Car;
import ch.heiafr.tic.Engine;

public class Main {
   public static void main(String[] args) {
      Engine e2 = new Engine('K', 86);
      Car c2 = new Car(1999, e2);
   }
}