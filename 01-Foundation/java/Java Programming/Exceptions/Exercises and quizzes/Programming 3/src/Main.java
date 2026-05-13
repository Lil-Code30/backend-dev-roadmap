class NoNumberException extends Exception {
}
class BadNumberException extends Exception {
}

public class Main {
   public static String findNumber(String s) /* Add the required exception annotation */ {
      String result = "";
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if ((c >= '0' && c <= '9') || c == '.') {
           result += c;
        }
        else if (result.length() > 0) {
           break;
        }
      }
      if (result.length() > 0) {
         return result;
      }
      throw new NoNumberException();
   }

   public static int convertInteger(String s) /* Add the required exception annotation */ {
      try {
         return Integer.parseInt(s);
      }
      catch (NumberFormatException e) {
         throw new BadNumberException();
      }
   }

   static final String s1 = "abcd";
   static final String s2 = "efgh";

   public static String embedNumber(int n) {
      return s1 + n + s2;
   }

   public static void main(String[] args) {
      String[] stringArray = { "example1234", "examplenonumber",
          "example12.34" };
      for (String s: stringArray) {
         /* Call the methods findNumber, convertInteger and embedNumber for producing the expected result without errors */
      }
   }
}