public class Dummy {
   public static int a = 1;
   public int b = 1;

   static {
      a = a + 1;
   }

   public Dummy() {
      a = a * 2;
      b = b * 2;
   }

   public static void f() {
      a = a - 1;
   }

   public void g() {
      a = a + 1;
      b = b + 1;
   }
}
