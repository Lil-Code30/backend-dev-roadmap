import ch.heiafr.tic.Dummy;

public class Main {
   public static void main(String[] args) {
      Dummy d = new Dummy(" from Main");
      String res = add("Message", d);
      System.out.println(res);
   }

   public static String add(String string, Dummy dummy) {
      // Receiving the interface as parameter and calling the dummy
      // interface's method
      return dummy.dummyMethod(string);
   }
}