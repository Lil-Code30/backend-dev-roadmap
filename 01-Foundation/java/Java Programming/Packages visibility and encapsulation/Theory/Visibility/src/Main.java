import ch.heiafr.tic.*;

public class Main {
   public static void main(String[] args) {
      A a = new A();
      int w = a.publicA;
      /* is int x = a.protectedA possible? */
      /* is int y = a.packageA; possible? */
      /* int z = a.privateA; possible? */
      /* is B b = new B(); possible? */
   }
}