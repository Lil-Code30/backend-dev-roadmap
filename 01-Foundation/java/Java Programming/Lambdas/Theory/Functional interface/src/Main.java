import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main {
   public static void main(String[] args) {
      Runnable lambda1 = () -> System.out.println("Hello World");
      lambda1.run();

      Supplier<Double> lambda2 = () -> Math.random();
      System.out.println("lambda2: number supplied is " + lambda2.get());

      Consumer<String> lambda3 = (s) -> System.out.println(s);
      lambda3.accept("This is my lambda3 use");

      BiConsumer<String, Integer> lambda4 = (x, y) ->
            System.out.printf("%s " + "%d\n", x, y);
      lambda4.accept("Lambda4 use: ", 4);

      BiFunction<String, String, String> lambda5 = (x, y) -> x + " " + y;
      System.out.println(lambda5.apply("Lambda 5", "takes two strings"));
   }
}