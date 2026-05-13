package ch.heifr.tic;

public class Engine {
   /* Add the correct modifier */ char type;
   /* Add the correct modifier */ int power;

   public Engine(char type, int power) {
      this.type = type;
      this.power = power;
   }

/* Write the necessary methods in an OO spirit */

   public String toString() {
      return "Engine of type " + this.type + " and of power " + this.power;
   }
}
