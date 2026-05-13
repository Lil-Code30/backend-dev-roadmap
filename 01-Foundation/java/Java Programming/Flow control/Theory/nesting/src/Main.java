public class Main {
   public static void main(String[] args) {
      int hour = 13;
      boolean itIsRaining = false;
      boolean iAmHungry = true;
      if (hour > 7 && hour < 11) {
         if (iAmHungry) {
            // hour > 7 && hour < 11 && iAmHungry
            System.out.print("I'm hungry, let's have breakfast in the ");
            if (itIsRaining) {
               // hour > 7 && hour < 11 && iAmHungry && itIsRaining
               System.out.println("kitchen");
            }
            else {
               // hour > 7 && hour < 11 && iAmHungry && !itIsRaining
               System.out.println("back yard");
            }
         }
         else {
            // hour > 7 && hour < 11 && !iAmHungry
            System.out.println("Let's skip breakfast!");
         }
      }
      else
      {
         if (iAmHungry) {
            // WHICH CONDITION IS VALID HERE
            System.out.println("I'm hungry, let's have a meal in the... ");
         }
      }
   }
}