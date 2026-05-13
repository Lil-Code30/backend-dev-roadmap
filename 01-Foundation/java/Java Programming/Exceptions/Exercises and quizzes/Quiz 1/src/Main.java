public class Main {

   public static int a() throws Exception {
      throw new Exception();
   }

   public static void main(String[] args) {
      int a = 10;
      try {
         a = 20;
      } catch (Exception e) {
         a = 30;
      }
      a = 40;
   }
}