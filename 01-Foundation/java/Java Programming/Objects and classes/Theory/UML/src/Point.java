public class Point {
   public double px; // Coordinate x of point (attribute)
   public double py; // Coordinate y of point (attribute)

   // First constructor
   public Point() {
      this(0.0, 0.0);
   }

   // Second constructor
   public Point(double x, double y) {
      px = x;
      py = y;
   }

   // First method
   public double distanceOrigin() {
      return Math.sqrt(px*px + py*py);
   }

   // Second method
   public String toString() {
      return String.format("(%.2f, %.2f)", px, py);
   }
}
