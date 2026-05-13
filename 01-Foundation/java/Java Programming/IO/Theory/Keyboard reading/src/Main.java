import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter an integer - or x to exit");
      while (scanner.hasNext()) {
         while (scanner.hasNext() && ! scanner.hasNextInt()) {
            String s = scanner.next();
            if (s.equals("x")) {
               System.err.println("Exited");
               return;
            }
         }
         while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println("Number is : " + i);
         }
      }
   }
}