package ch.heiafr.tic;

public class Form implements Transformable {
   @Override
   public void rotate() {
      System.out.println("Form rotation");
   }

   @Override
   public void scale() {
      System.out.println("Form scaling");
   }

   @Override
   public void translate() {
      System.out.println("Form translation");
   }
}
