package ch.heiafr.tic;

public class Car extends Vehicle {

   private int doorsNumber;

   public Car(String brand, int doorsNumber) {
      super(brand);
      this.doorsNumber = doorsNumber;
   }

   public String toString() {
      return super.toString() + String.format(" and has %d doors", doorsNumber);
   }
}
