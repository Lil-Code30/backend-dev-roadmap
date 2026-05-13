package ch.heiafr.tic;

public class Fish extends Animal {

   public Fish(int age, int poids) {
      super(age, poids);
   }

   @Override
   public void eat() {
      System.out.println("The fish eats");
   }

   public void swim() {
      System.out.println("The fish swims");
   }
}
