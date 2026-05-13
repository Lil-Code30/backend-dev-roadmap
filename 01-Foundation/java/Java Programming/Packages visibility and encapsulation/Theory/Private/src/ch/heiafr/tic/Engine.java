package ch.heiafr.tic;

public class Engine {
   private char type;
   private int power;

   public Engine(char type, int power) {
      this.type = type;
      this.power = power;
   }

   public String toString() {
      return "Engine of type " + type + " and of power " + power;
   }
}
