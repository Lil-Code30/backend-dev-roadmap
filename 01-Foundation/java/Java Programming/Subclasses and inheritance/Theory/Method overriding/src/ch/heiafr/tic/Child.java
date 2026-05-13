package ch.heiafr.tic;

public class Child extends Parent {

   @Override
   public void print() {
      System.out.println("Derived");
   }

   public void print(String s) {
      print();
      System.out.println(s);
   }
}
