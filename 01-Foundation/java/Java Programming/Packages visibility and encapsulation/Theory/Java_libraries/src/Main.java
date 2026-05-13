import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {
      // The Math package is implicitly imported as he is in java.lang
      long i = Math.round(2.0);
      // The System package is implicitly imported as he is in java.lang
      System.out.println("Hello");
      // The util package contains utility classes as collections such as lists
      List<Integer> l = new ArrayList<>();
      // ...
   }
}