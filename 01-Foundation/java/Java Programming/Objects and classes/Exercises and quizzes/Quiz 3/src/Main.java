public class Main {
   public static void main(String[] args) {
      Dummy d1 = new Dummy(2);
      Dummy d2 = new Dummy(1);
      d2 = d1;
      d2.f(d2);
      d1 = d2.g();
   }
}