import ch.heiafr.tic.Dummy;

public class Main {
   public static void main(String[] args) {
      Dummy d = new Dummy(1);
      int v = 0;

      // Which line do compile ?
      // v = d.a;
      // d.a = v;
      // v = d.b;
      // d.b = v;
      // v = d.c;
      // v = d.d;
      // d.d = v;
      // v = d.e;
      // v = d.f;
      // d.f = v;
   }
}