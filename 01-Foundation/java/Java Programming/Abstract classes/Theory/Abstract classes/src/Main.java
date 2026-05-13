import ch.heiafr.tic.Circle;
import ch.heiafr.tic.Rectangle;
import ch.heiafr.tic.Shape;

import java.util.Locale;

public class Main {
   public static void main(String[] args) {
      // Create an array of shapes (it works as Rectangle and Circle are shapes)
      Shape[] shapes = new Shape[] {
            new Rectangle(4.0, 2.5, 6.8),
            new Circle(3.0, 4.63),
      };
      // Using polymorphism, call a method on each object
      double totalArea = 0.0;
      for (Shape s: shapes) {
         totalArea += s.area();
      }
      System.out.printf(Locale.US, "Total area is %.2f%n", totalArea);
   }
}