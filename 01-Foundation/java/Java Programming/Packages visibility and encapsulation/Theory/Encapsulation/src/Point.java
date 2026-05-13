import java.util.Locale;

public class Point {
   private double px; // Attribute px is private
   private double py; // Attribute py is private

   // First constructor
   public Point() {
      this(0.0, 0.0);
   }

   // Second constructor
   public Point(double x, double y) {
      px = x;
      py = y;
   }

   // Getter for px
   public double getPx() { return px; }

   // Getter for py
   public double getPy() { return py; }

   // Setter for px. Necessary ?
   public void setPx(double x) {
      px = x;
   }

   // Setter for py. Necessary ?
   public void setPy(double y) {
      py = y;
   }

   public double distanceOrigin() {
      return Math.sqrt(px*px + py*py);
   }

   public String toString() {
      return String.format(Locale.US, "(%.2f, %.2f)", this.px, this.py);
   }
}
