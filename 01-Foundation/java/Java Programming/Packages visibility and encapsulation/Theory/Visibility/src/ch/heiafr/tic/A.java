package ch.heiafr.tic;

public class A {
   public int publicA;        // public modifier
   protected int protectedA;  // protected modifier
   int packageA;              // package (friendly) modifier
   private int privateA;      // private modifier

   public void access() {
      B b = new B();
      int w = b.publicB;
      int x = b.protectedB;
      int y = b.packageB;
      // Not possible !
      // int z = b.privateB;
   }
}
