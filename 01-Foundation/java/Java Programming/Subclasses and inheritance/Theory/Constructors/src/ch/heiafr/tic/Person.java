package ch.heiafr.tic;

public class Person {
   private String first_name;
   private String last_name;

   public Person(String first_name, String last_name) {
      this.first_name = nameFormatting(first_name);
      this.last_name = nameFormatting(last_name);
      System.out.println("Person constructor");
   }

   @Override
   public String toString() {
      return first_name + " " + last_name;
   }

   private static String nameFormatting(String s) {
      return s.substring(0, 1).toUpperCase() + s.substring(1);
   }
}
