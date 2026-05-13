public class Main {
   public static void main(String[] args) {
      String a = "a";
      String b = "b";
      // Concatenation
      String concatenation = a + b;
      System.out.println(concatenation);
      // Some methods
      String hello = "Hello World";
      System.out.println("Length is : " + hello.length());
      System.out.println("Substring is : " + hello.substring(0, 5));
      System.out.println("Substring is : " +hello.substring(6));
      System.out.println("UpperCase is : " + hello.toUpperCase());
      // Conversion examples
      int number = Integer.parseInt("342");
      System.out.println("Value of number is " + number);
      String stringNumber = Integer.toString(number);
      System.out.println("String is " + stringNumber);
   }
}