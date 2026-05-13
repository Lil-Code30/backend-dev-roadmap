package ch.heiafr.tic;

public class Dog extends Animal {

   private String name;

   public Dog(int age, int poids, String name) {
      super(age, poids);
      this.name = name;
   }

   public void eat() {
      System.out.println("The dog eats");
   }

   public void play() {
      System.out.println("The dog plays");
   }
}
