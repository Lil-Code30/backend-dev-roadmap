package ch.heiafr.tic;

import java.util.Locale;

public class Vehicle {

   private final String brand;
   private double speed;         // Actual speed
   private boolean isPowered;    // false : turned off, true : turned on

   public Vehicle(String brand) {
      this.brand = brand;
      this.speed = 0.0;
      this.isPowered = false;
   }

   public void start() {
      isPowered = true;
   }

   public void stop() {
      if (speed == 0) {
         isPowered = false;
      }
   }

   public void speedUp() {
      if (isPowered) {
         speed += 5.0;
      }
   }

   public void speedDown() {
      if (speed >= 5.0) {
         speed -= 5.0;
      } else {
         speed = 0.0;
      }
   }

   public String toString() {
      if (isPowered) {
         return String.format(Locale.US, "Vehicle of model %s has a speed of %.2f",
               brand, speed);
      } else {
         return String.format("Vehicle of model %s is powered off", brand);
      }
   }
}
