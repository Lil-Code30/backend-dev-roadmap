import ch.heiafr.tic.Form;
import ch.heiafr.tic.Transformable;

public class Main {
   public static void main(String[] args) {
      Transformable form = new Form();
      form.rotate();
      form.translate();
      form.scale();
   }
}