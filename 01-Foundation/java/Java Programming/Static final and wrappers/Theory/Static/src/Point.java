public class Point {
   private double px;            // class attribute
   private double py;            // class attribute
   public int pNr;               // class attribute
   public static int nextNr = 1; // static attribute

   // Constructor
   public Point(double x, double y) {
      this.px = x;
      this.py = y;
      this.pNr = nextNr++;
   }

   // Class method
   public double distanceOrigin() {
      return Math.sqrt(this.px * this.px + this.py * this.py);
   }

   // Static method
   public static double distance(Point p1, Point p2) {
      // Not possible
      // this.px
      double a = (p1.px - p2.px) * (p1.px - p2.px);
      double b = (p1.py - p2.py) * (p1.py - p2.py);
      return Math.sqrt(a + b);
   }
}

