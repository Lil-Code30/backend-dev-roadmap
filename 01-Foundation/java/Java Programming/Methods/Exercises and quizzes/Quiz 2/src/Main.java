public class Main {

   public static void a() {
      int value = 0;
      System.out.print(value + " ");
   }

   public static int b(int value) {
      a();
      System.out.print(value + " ");
      value = 2;
      return value * 3;
   }

   public static int c(int f, int g) {
      int value = 3 + f;
      System.out.print(value + " ");
      b(value);
      return f + g;
   }

   public static void main(String[] args) {
      int value = 1;
      System.out.print(c(5, 6) + " ");
      System.out.print(value + " ");
   }
}