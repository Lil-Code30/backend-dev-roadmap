public class Main {
   public static void main(String[] args) {
      Student s1 = new Student();
      System.out.println(s1.getName() + " is major ? " + s1.isMajor());
      Student s2 = new Student("Abc", "Def", 17);
      System.out.println(s2.getName() + " is major ? " + s2.isMajor());
      Student s3 = new Student("Ghi", "Jkl", 16);
      System.out.println(s3.first_name + " " + s3.last_name + " of age " + s3.age);
   }
}