public class Main {
   public static void main(String[] args) {
      int number = 1;
      int counter = 0;
      while (number <= 12) {
         if (number % 2 == 0 && number % 3 == 0) {
            counter++;
         }
         number++;
      }
      System.out.println(counter);
   }
}