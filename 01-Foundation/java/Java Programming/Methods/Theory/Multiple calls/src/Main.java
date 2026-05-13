public class Main {

   public static void main(String[] args) {
      p();
      int res = f(f(1, f(2, 3)) * f(4, 5), f(6, 7));
      System.out.println(res);
   }

   public static void r() {
      System.out.println("r");
   }

   public static void q() {
      r();
      System.out.println("q");
   }

   public static void p() {
      q();
      System.out.println("p");
   }

   public static int f(int a, int b) {
      System.out.format("f is called with a = %d and b = %d", a, b);
      System.out.println();
      return a + b;
   }
}