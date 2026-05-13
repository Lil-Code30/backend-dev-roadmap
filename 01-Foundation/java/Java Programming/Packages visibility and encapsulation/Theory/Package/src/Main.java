// The import key-word which import each class individually
import ch.heiafr.tic.Car;
import ch.heiafr.tic.Engine;

// The import key-word which import all classes of the package


public class Main {
   public static void main(String[] args) {
      // Using the full name as if the import key-word wasn't used
      ch.heiafr.tic.Engine e1 = new ch.heiafr.tic.Engine('K', 86);
      ch.heiafr.tic.Car c1 = new ch.heiafr.tic.Car(1999, e1);
      // By using the import key-word, the same become the following
      Engine e2 = new Engine('K', 86);
      Car c2 = new Car(1999, e2);
   }
}