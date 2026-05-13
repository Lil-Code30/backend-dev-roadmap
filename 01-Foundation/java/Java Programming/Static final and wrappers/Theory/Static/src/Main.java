public class Main {
   public static void main(String[] args) {
      Point p1 = new Point(1.0, 2.0);
      Point p2 = new Point(2.0, 3.0);
      int n = Point.nextNr;               // static attribute
      double d1 = Point.distance(p1, p2); // static method
      double d2 = p1.distanceOrigin();    // class method
      // This notation is accepted but is not recommended
      n = p1.nextNr;
   }
}