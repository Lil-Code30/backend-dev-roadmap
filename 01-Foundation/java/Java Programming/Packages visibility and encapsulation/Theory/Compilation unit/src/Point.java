import java.util.Locale;

public class Point {
   public double px;
   public double py;

   // First constructor
   public Point() {
      this(0.0, 0.0);
   }

   // Second constructor
   public Point(double x, double y) {
      px = x;
      py = y;
   }

   public double distanceOrigin() {
      return Math.sqrt(px*px + py*py);
   }

   public String toString() {
      return String.format(Locale.US, "(%.2f, %.2f)", this.px, this.py);
   }
}
