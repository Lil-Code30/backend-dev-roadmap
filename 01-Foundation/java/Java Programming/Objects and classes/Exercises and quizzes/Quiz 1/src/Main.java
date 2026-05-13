public class Main {
   public static void main(String[] args) {
      Dummy d1 = new Dummy();
      Dummy d2 = new Dummy();
      d1.add();
      d2.remove();
      System.out.println(d1.number + " " + d2.number);
   }
}