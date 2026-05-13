public class Main {
   public static void main(String[] args) {
      int age = 23;
      System.out.println("If your age is " + age + ", " + "then...");
      if (age >= 18) {
         System.out.println("you can vote.");
      }
      if (13 <= age && age < 18) {
         System.out.println("You must go to school.");
      }
      if (age < 6) {
         System.out.println("It is surprising that you do this exercice !");
      }
   }
}