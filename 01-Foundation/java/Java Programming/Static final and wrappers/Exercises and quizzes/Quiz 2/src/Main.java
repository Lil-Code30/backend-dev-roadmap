public class Main {
   public static void main(String[] args) {
      Dummy d = new Dummy();
      d.f();
      d.g();
      d = new Dummy();
      d.f();
      d.g();
   }
}