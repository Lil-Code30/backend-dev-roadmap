public class Main {

   public static void method(Car c) {
      System.out.println("Method is called");
      c.year = 2022;
   }

   public static void main(String[] args) {
      // === Affectation
      Car myCar = new Car(1999);
      Car otherCar = new Car(2000);

      System.out.println("References BEFORE affectation");
      System.out.println("MyCar : " + myCar);
      System.out.println("OtherCar : " + otherCar);
      System.out.println("References AFTER affectation");
      otherCar = myCar;
      System.out.println("MyCar : " + myCar);
      System.out.println("OtherCar : " + otherCar);
      System.out.println("Modifications AFTER affectation");
      otherCar.year = 2014;
      System.out.println("MyCar's year is " + myCar.year);
      System.out.println("===================================================");

      // === Comparison
      myCar = new Car(1999);
      otherCar = new Car(1999);

      boolean b = myCar == otherCar;
      System.out.println("Comparison result is " + b);
      System.out.println("===================================================");

      // === Parameter passing
      myCar = new Car(1999);
      otherCar = new Car(2023);

      method(otherCar);
      System.out.println("MyCar's year is " + myCar.year);
      System.out.println("OtherCar's year is " + otherCar.year);
      System.out.println("===================================================");
   }
}