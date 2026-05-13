package ch.heiafr.tic;

@FunctionalInterface
public interface MyInterface {
   default void i() {
      System.out.println("I");
   }

   void j();
}
