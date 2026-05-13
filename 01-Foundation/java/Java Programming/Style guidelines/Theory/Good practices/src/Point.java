import java.util.Locale;

/**
 * This class represent a point in the 2D space with the origin at (0, 0).
 */
public class Point {
   private double px; // Coordinate x of point
   private double py; // Coordinate x of point

   /**
    * Initialize a point at the origin (0, 0).
    */
   public Point() {
      this(0.0, 0.0);
   }

   /**
    * Initialize a point at the given coordinate (x, y).
    *
    * @param x The coordinate x of point.
    * @param y The coordinate y of point.
    */
   public Point(double x, double y) {
      px = x;
      py = y;
   }

   /**
    * Get the coordinate x of point.
    *
    * @return The coordinate x of point.
    */
   public double getPx() { return px; }

   /**
    * Get the coordinate y of point.
    *
    * @return The coordinate y of point.
    */
   public double getPy() { return py; }

   /**
    * Compute the distance between the origin and the point,
    * using the Euclidean formula.
    *
    * @return The distance between the origin and the point.
    */
   public double distanceOrigin() {
      return Math.sqrt(px*px + py*py);
   }

   /**
    * Return a string representation of the point.
    *
    * @return The string representation of the objet.
    */
   public String toString() {
      return String.format(Locale.US, "(%.2f, %.2f)", this.px, this.py);
   }
}
