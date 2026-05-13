public class Main {
   public static void main(String[] args) {
      double d1 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
      System.out.println(d1);
      System.out.println(d1 == 0.9);

      double d2 = 0.2 + 0.2 + 0.2 + 0.2 + 0.1;
      System.out.println(d2);
      System.out.println(d1 == d2);

      float f1 = 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f;
      System.out.println(f1);
      System.out.println(f1 == 0.9f);

      float f2 = 0.2f + 0.2f + 0.2f + 0.2f + 0.1f;
      System.out.println(f2);
      System.out.println(f1 == f2);
   }
}