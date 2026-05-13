package ch.heiafr.tic;

// Concrete classe extending the abstract class Shape
public class Circle extends Shape {
   public static final double PI = 3.14159265358979;

   private final double radius;

   public Circle(double weight, double radius) {
      super(weight);
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }

   // Abstract method
   @Override
   public double perimeter() {
      return 2 * PI * getRadius();
   }

   // Abstract method
   @Override
   public double area() {
      return PI * getRadius() * getRadius();
   }
}
