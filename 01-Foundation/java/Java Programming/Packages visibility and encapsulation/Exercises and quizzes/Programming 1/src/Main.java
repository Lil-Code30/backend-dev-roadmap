import ch.heifr.tic.*;

public class Main {
   public static void main(String[] args) {
      Engine e = new Engine('K', 86);
      Car c = new Car(1999, e);
      System.out.println(c.toString());
      // Renew the car by a new one from factory
      c = c.newCarFromFactory(2022);
      System.out.println(c.toString());
   }
}