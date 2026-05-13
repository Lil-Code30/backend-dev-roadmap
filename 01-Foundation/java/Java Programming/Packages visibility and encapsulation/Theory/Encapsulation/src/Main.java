import java.util.Locale;

public class Main {
   public static void main(String[] args) {
      Point p = new Point(1.0, 2.0);
      double d = p.distanceOrigin();
      System.out.println(String.format(Locale.US, "Point p is (%.2f, %.2f)",
            p.getPx(), p.getPy()));
      System.out.println(String.format(Locale.US, "Distance d is %.2f", d));

      // Necessary to have these methods ?
      p.setPx(4.0);
      p.setPy(3.0);
      d = p.distanceOrigin();
      System.out.println(String.format(Locale.US, "Distance d is %.2f", d));
   }
}