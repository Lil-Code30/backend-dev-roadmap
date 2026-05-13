public class Dummy {

   static {
      System.out.print("S");
   }

   public static void f() {
      System.out.print("F");
   }

   public Dummy() {
      System.out.print("D");
   }

   public void g(){
      System.out.print("G");
   }
}