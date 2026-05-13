public class Main {
   public static void main(String[] args) {
      // Creation and initialization
      String hello = "Hello";
      String helloWorld = "Hello World";

      // NOT POSSIBLE
      // String s = 'a' // Because this is a char -> primitive type !

      // Reference comparison
      System.out.println("Same reference ? " + (hello == helloWorld));
      hello = helloWorld;
      System.out.println("Same reference ? " + (hello == helloWorld));

      // Equals comparison
      System.out.println("Is it equals ? " + "HelloWorld".equals("HelloWorld"));
      System.out.println("Is it equals ? " + "Hello".equals("HelloWorld"));

      // CompareTo comparison
      int res = "Hello World".compareTo("Hello World");
      System.out.println("When result is 0, the string are the same : " + res);

      res = "Hello Moon".compareTo("Hello World");
      System.out.println("When result is negative, the first string is " +
            "smaller than the second (lexicography order) : " + res);

      res = "Hello World".compareTo("Hello Moon");
      System.out.println("When result is positive, the first string is " +
            "bigger than the second (lexicography order) : " + res);
      res = "HelloWorld".compareTo("Hello World");
   }
}