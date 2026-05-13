import java.util.Locale;

public class Main {
   public static void main(String[] args) {
      // Declaration and creation of an objet p1
      Point p1 = new Point(1.0, 2.0);
      // Declaration and creation of an objet p2
      Point p2 = new Point(3.0, 4.0);

      double vx, vy, d;
      String s;

      vx = p1.px; // Read the attribute px of p1
      vy = p1.py; // Read the attribute py of p1
      p1.px = p1.px + 1.5; // Modify the value of attribute px of p1

      d = p1.distanceOrigin(); // Execute a method of p1
      s = p1.toString(); // Execute a method of p1
      System.out.println(String.format(Locale.US, "Distance to origine is %.2f", d));
      System.out.println("Point p1 is " + s);

      s = p2.toString(); // Execute a method of p2
      System.out.println("Point p2 is " + s);
   }
}