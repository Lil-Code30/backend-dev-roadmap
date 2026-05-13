public class Main {
   public static void main(String[] args) {
      // Declaration and initialisation of an Engine and Car
      Engine e = new Engine('K', 86);
      Car myCar = new Car(1999, e);

      // Print the car
      System.out.println(myCar.toString());
      Engine newEngine = new Engine('K', 92);
      // Change the car's engine
      myCar.changeEngine(newEngine);
      System.out.println(myCar.toString());
      // Renew the car by a new one from factory
      myCar = myCar.newCarFromFactory(2022);
      System.out.println(myCar.toString());
   }
}