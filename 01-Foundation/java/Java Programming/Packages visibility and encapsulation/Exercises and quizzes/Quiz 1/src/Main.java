public class Main {
   public static void main(String[] args) {
      A a = new A(1, 2, 3);
      int sum = a.f();
      a.x = 4;
      a.y = 5;
      a.z = 6;
      sum = a.f();
   }
}