package ch.heiafr.tic;

public class B extends A {

   public B() {
      super();
      System.out.print("B");
   }

   @Override
   public void f() {
      System.out.print("Bf");
   }
}
