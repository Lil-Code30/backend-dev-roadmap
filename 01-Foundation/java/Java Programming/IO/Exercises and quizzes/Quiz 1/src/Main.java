import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      int index = 0;
      System.out.println("Start...");
      while (scanner.hasNext()) {
         try {
            int res = 0;
            switch(index) {
               case 1:
                  String s = scanner.next();
                  if (s.length() != 3 || s.charAt(0) != '0') {
                     System.err.println("Error");
                     return;
                  }
                  res = Integer.parseInt(s);
                  sb.append(s).append('/');
                  break;
               case 2:
                  s = scanner.next();
                  if (s.length() != 3) {
                     System.err.println("Error");
                     return;
                  }
                  res = Integer.parseInt(s);
                  sb.append(s).append('.');
                  break;
               case 3:
                  s = scanner.next();
                  if (s.length() != 2) {
                     System.err.println("Error");
                     return;
                  }
                  res = Integer.parseInt(s);
                  sb.append(s).append('.');
                  break;
               case 4:
                  s = scanner.next();
                  if (s.length() != 2) {
                     System.err.println("Error");
                     return;
                  }
                  res = Integer.parseInt(s);
                  sb.append(s);
                  System.out.println(sb);
                  System.out.println("Exit");
                  return;
               }
            index++;
         } catch (NumberFormatException e) {
            System.err.println("Error");
            return;
         }
      }
   }
}