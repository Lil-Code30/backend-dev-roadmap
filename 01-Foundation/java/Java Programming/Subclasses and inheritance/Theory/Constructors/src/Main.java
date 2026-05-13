import ch.heiafr.tic.Muggle;
import ch.heiafr.tic.Student;
import ch.heiafr.tic.Teacher;
import ch.heiafr.tic.Wizard;

public class Main {
   public static void main(String[] args) {
      Muggle m = new Muggle("Dudley", "Dursley");
      System.out.println("===========");
      Student s = new Student(
            "Harry", "Potter", Wizard.HOUSES[0]
      );
      System.out.println("===========");
      Teacher t = new Teacher(
            "Albus",
            "Dumbledor",
            Wizard.HOUSES[0],
            "Director"
      );
      System.out.println("===========");
      Wizard w = new Wizard(
            "Sirius",
            "Black",
            Wizard.HOUSES[0]
      );
   }
}