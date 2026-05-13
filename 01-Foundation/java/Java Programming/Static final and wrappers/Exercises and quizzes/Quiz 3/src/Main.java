public class Main {
   public static void main(String[] args) {
      System.out.print("A");
      Dummy.f();
      System.out.print("B");
      Dummy d = new Dummy();
      d.g();
      System.out.print("C");
   }
}