import ch.heiafr.tic.*;

public class Main {
   public static void main(String[] args) {
      Packager<Integer> p1 = new IntegerBox();
      p1.set(10);
      System.out.println(p1.get());

      Packager<String> p2 = new Box<>();
      p2.set("Hello World");
      System.out.println(p2.get());
   }
}