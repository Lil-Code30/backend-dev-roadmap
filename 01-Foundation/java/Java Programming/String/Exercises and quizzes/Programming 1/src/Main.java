public class Main {

   public static boolean palindrome(String a) {
/* Complete the palindrome method */
   }

   public static void main(String[] args) {
      String s = "madam";
      System.out.println("Is '" + s + "' a palindrome : " + palindrome(s));

      s = "Do geese see God";
      String sPal = s.replace(" ", "").toLowerCase();
      System.out.println("Is '" + s + "' a palindrome : " + palindrome(sPal));

      s = "This is not a palindrome";
      sPal = s.replace(" ", "").toLowerCase();
      System.out.println("Is '" + s + "' a palindrome : " + palindrome(sPal));
   }
}