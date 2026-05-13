import ch.heiafr.tic.Box;

import java.awt.*;

public class Main {
   public static void main(String[] args) {
      // Initializing and using generic class
      Box<Integer> intBox = new Box<>(); // or new Box<Integer>();
      Box<String> strBox = new Box<>();  // or new Box<String>();
      Box<Point> pBox = new Box<>();     // or new Box<Point2D>();

      intBox.set(5);
      strBox.set("Hello");
      pBox.set(new Point(1, 3));

      System.out.println(intBox.get());
      System.out.println(strBox.get());
      System.out.println(pBox.get());

      // Possible but to avoid
      Box rawType = new Box();   // Raw type
      rawType.set(8);            // Autoboxing int -> Integer -> Object
      System.out.println(rawType.get());
      rawType.set("Hello");      // Autoboxing String -> Object
      System.out.println(rawType.get());

      // cannot instantiate classes with primitive types
      // Box<int> intBox2 = new Box<>();
   }
}