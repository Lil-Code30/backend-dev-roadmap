package ch.heiafr.tic;

public class Teacher extends Wizard {

   private String field;

   public Teacher(String first_name,
                  String last_name,
                  String house,
                  String field) {
      super(first_name, last_name, house);
      this.field = field;
      System.out.println("Teacher constructor");
   }

   @Override
   public String toString() {
      return super.toString() + String.format(" (field : %s)", field);
   }
}
