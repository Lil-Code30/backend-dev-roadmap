import java.util.Locale;

public class Main {
   public static void main(String[] args) {
      Circle c = new Circle(3);
      System.out.printf(Locale.US, "The perimeter is : %.2f%n", c.perimeter());
      System.out.printf(Locale.US, "The area is : %.2f%n", c.area());

      System.out.printf(Locale.US, "Pi value is %.2f%n", Circle.PI);
      // Not allowed
      // Circle.PI = 3.0;

      final Circle finalCircle = new Circle(2);
      // Not allowed
      // finalCircle = c;
      System.out.printf("FinalCircle's radius is : %d%n",
          finalCircle.getRadius());
      finalCircle.setRadius(4);
      System.out.printf("FinalCircle's radius is : %d%n",
          finalCircle.getRadius());
   }
}