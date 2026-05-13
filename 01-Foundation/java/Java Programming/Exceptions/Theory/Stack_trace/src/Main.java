public class Main {

   public static int a() {
      return b();
   }

   public static int b() {
      return c();
   }

   public static int c() throws IllegalArgumentException {
      throw new IllegalArgumentException("My error message");
   }

   public static void main(String[] args) {
      a();
   }
}