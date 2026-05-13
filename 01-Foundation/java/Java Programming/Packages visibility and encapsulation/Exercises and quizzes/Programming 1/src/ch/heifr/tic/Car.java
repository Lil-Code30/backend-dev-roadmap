package ch.heifr.tic;

public class Car {
   /* Add the correct modifier */ int year;
   /* Add the correct modifier */ Engine engine;

   public Car(int year, Engine motor) {
      this.year = year;
      this.engine = motor;
   }

/* Write the necessary methods in an OO spirit */

   public String toString() {
      return "Car of year " + this.year +
            " and of " + this.engine.toString().toLowerCase();
   }
}
