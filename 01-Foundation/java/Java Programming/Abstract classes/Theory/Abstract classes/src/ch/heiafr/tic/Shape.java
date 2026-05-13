package ch.heiafr.tic;

public abstract class Shape {
   private final double weight;

   public Shape(double weight) {
      this.weight = weight;
   }

   public abstract double perimeter();
   public abstract double area();

   public double density() {
      return weight / area();
   }
}
