package ch.heiafr.tic;

// Concrete classe extending the abstract class Shape
public class Rectangle extends Shape {
   protected final double length, width;

   public Rectangle(double weight, double length, double width) {
      super(weight);
      this.length = length;
      this.width  = width;
   }

   public boolean isSquare()  { return length == width; }

   // Abstract method
   @Override
   public double perimeter() {
      return 2 * (length + width);
   }

   // Abstract method
   @Override
   public double area() {
      return length * width;
   }
}
