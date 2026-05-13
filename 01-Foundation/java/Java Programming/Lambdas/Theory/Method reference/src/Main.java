import ch.heifr.tic.MyConcatenate;
import ch.heifr.tic.MyPrint;
import ch.heifr.tic.MyRandom;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
   public static void main(String[] args) {
      // =======================================================================
      // AIM : generate a random double number between 0 and 1 (no param,
      // returns a Double) -> implemented with the interface Supplier<Double>
      // === With concrete class
      MyRandom myRandom = new MyRandom();
      System.out.printf(Locale.US, "With concrete class: %.2f%n", myRandom.get());
      // === With anonymous class
      Supplier<Double> anonymousClass1 = new Supplier<Double>() {
         @Override
         public Double get() {
            return Math.random();
         }
      };
      System.out.printf(Locale.US, "With anonymous class: %.2f%n", anonymousClass1.get());
      // === With lambda
      Supplier<Double> lambda1 = () -> Math.random();
      System.out.printf(Locale.US, "With lambda: %.2f%n", lambda1.get());
      // === With method reference
      // Variante 1 -> Class::staticMethodName
      Supplier<Double> methodReference1 = Math::random;
      System.out.printf(Locale.US, "With variante 1: %.2f%n", methodReference1.get());

      // =======================================================================
      // AIM : print a message (one param, without return)
      // -> implemented with the interface Consumer<String>
      // === With concrete class
      MyPrint myPrint = new MyPrint();
      myPrint.accept("With concrete class: Hello World");
      // === With anonymous class
      Consumer<String> anonymousClass2 = new Consumer<String>() {
         @Override
         public void accept(String s) {
            System.out.println(s);
         }
      };
      anonymousClass2.accept("With anonymous class: Hello World");
      // === With lambda
      Consumer<String> lambda2 = (s) -> System.out.println(s);
      lambda2.accept("With lambda: Hello World");
      // === With method reference
      // Variante 2 -> instance::instanceMethodName
      Consumer<String> methodReference2 = System.out::println;
      methodReference2.accept("With variante 2: Hello World");

      // =======================================================================
      // AIM : concatenate strings (two params, returns a String)
      // -> implemented with the interface BiFunction<String, String, String>
      // === With concrete class
      MyConcatenate myConcatenate = new MyConcatenate();
      String s = myConcatenate.apply("Hello", "World");
      System.out.printf("With concrete class: %s%n", s);
      // === With anonymous class
      BiFunction<String, String, String> anonymousClass3 = new BiFunction<String, String, String>() {
        @Override
        public String apply(String s1, String s2) {
          return s1 + " " + s2;
        }
      };
      s = anonymousClass3.apply("Hello", "World");
      System.out.printf("With anonymous class: %s%n", s);
      // === With lambda
      BiFunction<String, String, String> lambda3 = (s1, s2) -> s1 + " " + s2;
      s = lambda3.apply("Hello", "World");
      System.out.printf("With lambda: %s%n", s);
      // === With method reference
      // Variante 3 -> Class::instanceMethodName
      BiFunction<String, String, String> methodReference3 = String::concat;
      s = methodReference3.apply("Hello", " World");
      System.out.printf("With variante 3: %s%n", s);


      // =======================================================================
      // AIM : compute x to the power of y
      // -> -> implemented with the interface BiFunction<Double, Double, Double>
      // === With lambda
      BiFunction<Double, Double, Double> lambda4 = (x, y) -> Math.pow(x, y);
      double res = lambda4.apply(2.0, 4.0);
      System.out.printf(Locale.US, "With lambda: %f%n", res);
      // === With method reference
      // Variante 3 -> Class::instanceMethodName
      BiFunction<Double, Double, Double> methodReference4 = Math::pow;
      res = lambda4.apply(2.0, 4.0);
      System.out.printf(Locale.US, "With variante 3: %f%n", res);
   }
}