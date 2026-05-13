package ch.heiafr.tic;

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

   @Override
   public void print() {
      int width = (int)Math.floor(this.width);
      int height = (int)Math.floor(this.length);
      width = width == 0 ? 1: width;
      height = height == 0 ? 1: height;
      for(int i = 0; i < width; i++) {
         for(int j = 0; j < height; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }
}