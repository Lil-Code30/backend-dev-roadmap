import java.util.Locale;

public class Main {
   public static void main(String[] args) {
      Point p1 = new Point(1.0, 2.0);
      double d = p1.distanceOrigin();
      System.out.println(String.format(Locale.US, "Distance to origin is %.2f", d));
   }
}