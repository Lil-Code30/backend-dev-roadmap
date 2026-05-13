package ch.heiafr.tic;

public class Student extends Wizard {

   private int year = 1;

   public Student(String first_name, String last_name, String house) {
      super(first_name, last_name, house);
      System.out.println("Student constructor");
   }

   public void addYear() {
      this.year += 1;
   }

   @Override
   public String toString() {
      return super.toString() + String.format(" (year : %d)", year);
   }
}
