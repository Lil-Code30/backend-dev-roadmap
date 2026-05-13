package ch.heiafr.tic;

public class Animal {
   private int age;
   private int weight;

   public Animal(int age, int poids) {
      this.age = age;
      this.weight = weight;
   }

   public void eat() {
      System.out.println("The animal eats");
   }

   public void sleep() {
      System.out.println("The animal sleeps");
   }
}
