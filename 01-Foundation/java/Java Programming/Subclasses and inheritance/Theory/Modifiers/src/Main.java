import abc.Dummy;
import ch.heiafr.tic.Child;
import ch.heiafr.tic.Parent;

public class Main {
   public static void main(String[] args) {
      Parent p = new Parent();
      p.print();

      Child c = new Child();
      c.print();

      Dummy d = new Dummy();
      d.print();
   }
}