public class Main {
   public static void main(String[] args) {
      int x = (int) 'a';
      byte i = 0;
      switch (x) {
         case 2: // this is ok
            System.out.println("x == 2");
            break;

         case 'a':
            System.out.println("x == " + (int) 'a');
            break;

         //case 512: // remark 2: not accepted, this would cause a compilation
         // error since '512' is too large for a 'byte'

         case 3:
            System.out.println("x == 3");
            // remark 3: no break !

         case 4:
         case 5:
            // remark 4: x == 4 and x == 5 are handled in the same way
            // when x == 3, this statement will also be executed
            System.out.println("x == 3 || x == 4 || x == 5");
            break;

         //case 5: // remark 5: not accepted, this would cause a compilation
         // error since the 'case 5' is already used

         default:
            System.out.println("x default value");
      }

   }
}