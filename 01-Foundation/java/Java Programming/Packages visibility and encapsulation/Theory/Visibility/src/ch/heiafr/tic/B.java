package ch.heiafr.tic;

class B {

   public int publicB;        // public modifier
   protected int protectedB;  // protected modifier
   int packageB;              // package (friendly) modifier
   private int privateB;      // private modifier

   public void access() {
      A a = new A();
      int w = a.publicA;
      int x = a.protectedA;
      int y = a.packageA;
      // Note possible !
      // int z = a.privateA;
   }
}
