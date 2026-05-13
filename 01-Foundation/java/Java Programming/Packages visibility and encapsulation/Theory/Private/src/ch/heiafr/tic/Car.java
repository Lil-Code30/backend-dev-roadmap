package ch.heiafr.tic;

public class Car {
   private int year;
   private Engine engine;

   public Car(int year, Engine motor) {
      this.year = year;
      this.engine = motor;
   }

   public void changeEngine(Engine e) {
      this.engine = e;
   }

   // Not possible anymore because Engine's attributes are private
   // public Car newCarFromFactory(int y) {
      // return new Car(y, new Engine(engine.type, engine.power));
   // }

   public void dummyMethod(Car c) {
      c.year = 1999;
      c.engine = new Engine('K', 99);
      // Not possible
      // c.engine.power;
      // c.engine.type;
   }

   public String toString() {
      return "Car of year " + year +
            " and of " + engine.toString().toLowerCase();
   }
}
