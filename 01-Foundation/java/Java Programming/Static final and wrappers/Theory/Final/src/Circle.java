public class Circle {

   public static final double PI = 3.141592653589793;

   private int radius;

   public Circle(int radius) {
      this.radius = radius;
   }

   public void setRadius(int radius) {
      this.radius = radius;
   }

   public int getRadius() {
      return this.radius;
   }

   public double perimeter() {
      return 2 * PI * radius;
   }

   public double area() {
      return PI * radius * radius;
   }
}
