import ch.heiafr.tic.*;

public class Main {
   public static void main(String[] args) {
      Form[] forms = new Form[] {
            new Form(5, 7),
            new Square(4),
            new Triangle(5),
      };

      for (Form f: forms) {
         f.print();
      }

      // Expected output:
      // Form of 5 edges with size 7
      // ****
      // ****
      // ****
      // ****
      //   *
      //  ***
      // *****
   }
}