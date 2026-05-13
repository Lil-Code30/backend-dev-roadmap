public class Car {
   public int year;
   public Engine engine;

   public Car(int year, Engine motor) {
      this.year = year;
      this.engine = motor;
   }

   public void changeEngine(Engine e) {
      this.engine = e;
   }

   public Car newCarFromFactory(int y) {
      return new Car(y, new Engine(engine.type, engine.power));
   }

   public String toString() {
      return "Car of year " + year +
             " and of " + engine.toString().toLowerCase();
   }
}
