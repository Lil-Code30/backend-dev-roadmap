public class Main {
   public static void main(String[] args) {
      // Declaration of a type Point
      Point p1;

      // Creation of an objet Point and assignation of the reference to p1.
      // The first constructor is used.
      p1 = new Point();

      // Declaration of p2, creation of an objet Point and assignation of the
      // reference to p2. The first constructor is used.
      Point p2 = new Point();

      // Declaration of p3, creation of an objet Point and assignation of the
      // reference to p3. The second constructor is used.
      Point p3 = new Point(2.0, 4.5);
   }
}