package ch.heiafr.tic;

import java.util.Locale;

public class Truck extends Vehicle {
   private int maxLoad;
   private int actualLoad;

   public Truck(String brand, int maxLoad) {
      super(brand);
      this.maxLoad = maxLoad;
      this.actualLoad = 0;
   }

   public void load(int load) {
      if (actualLoad + load <= maxLoad) {
         actualLoad += load;
      } else {
         throw new IllegalArgumentException("Loading too much...");
      }
   }

   public void unload(int load) {
      if (actualLoad >= load) {
         actualLoad -= load;
      } else {
         throw new IllegalArgumentException("Unloading too much...");
      }
   }

   public String toString() {
      return super.toString() +
            String.format(Locale.US, " and has %d kg of load", actualLoad);
   }
}
