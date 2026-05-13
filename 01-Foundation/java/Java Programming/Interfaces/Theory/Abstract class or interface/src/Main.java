import ch.heiafr.tic.*;

import java.util.Locale;

public class Main {
   public static void main(String[] args) {
      Shape s = new Rectangle(1.0, 3.0, 2.0);
      System.out.printf(Locale.US, "Perimeter is %.2f%n", s.perimeter());
      System.out.printf(Locale.US, "Area is %.2f%n", s.area());

      Printable p = new Rectangle(1.0, 4.0, 3.0);
      p.print();
   }
}