public class Main {
   public static void main(String[] args) {
      double score = 8.9;
      System.out.println("Your grade is " + score + "/10 for this test.");
      if (score > 6.0) {
         System.out.println("You passed the test!");
      } else {
         System.out.println("Hmm, you need to redo the exam.");
      }
   }
}