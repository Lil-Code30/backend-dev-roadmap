package ch.heiafr.tic;

public class Person implements AbleToCompare {
   private String name;
   private int age;

   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public boolean isSmallerThan(Object p) {
      if (p instanceof Person) {
         return (this.age < ((Person)p).age);
      }
      return false;
   }

   public boolean isBiggerThan(Object p) {
      if (p instanceof Person) {
         return (this.age > ((Person)p).age);
      }
      return false;
   }

   @Override
   public String toString() {
      return String.format("%s is %d years old", name, age);
   }
}
