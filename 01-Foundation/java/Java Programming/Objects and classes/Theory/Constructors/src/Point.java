public class Point {
   public double px; // Coordinate x of point (attribute)
   public double py; // Coordinate y of point (attribute)

   // First constructor
   public Point() {
      // Special call to the second constructor with the given arguments
      this(0.0, 0.0);
   }

   // Second constructor
   public Point(double x, double y) {
      // The attributes x and y are initialised with the given arguments
      px = x;
      py = y;
   }
}
