public class Main {

   public static int a(int value) throws IllegalArgumentException {
      if(value < 0) {
         throw new IllegalArgumentException();
      }
      return value + 1;
   }

   public static int b(int value) throws Exception {
      if(value == 1) {
         throw new Exception();
      }
      return value + 1;
   }

   public static void main(String[] args) {
      int value = 0;
      try {
         value = a(value);
         value = b(value);
      } catch (IllegalArgumentException e) {
         value = value + 10;
      } catch (Exception e) {
         value = value + 15;
      } finally {
         value = value + 20;
      }
      System.out.println(value);
   }
}