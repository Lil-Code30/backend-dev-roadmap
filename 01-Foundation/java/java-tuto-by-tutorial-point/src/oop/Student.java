package oop;

// base class for all students
class Person{
    String name;

    Person(String name){
        this.name = name;
    }
}

// create a Student class
public class Student extends Person {
    // Declaring attributes
    int rollNo;
    String section;

    // initialize attributes
    Student(String name, int rollNo, String section){
        super(name);
        this.rollNo = rollNo;
        this.section = section;
    }

    // print details

    public void printDetails(boolean hideSection) {
        System.out.println("Student Details:");
        System.out.println(this.name+ ", "+", " + this.rollNo + ", " + (hideSection ? "" : section));
    }

    public static void main(String[] args){
        // create student objects
        Student student1 = new Student("Robert", 1, "IX Blue");
        Student student2 = new Student("Adam", 2, "IX Red");
        Student student3 = new Student("Julie", 3, "IX Blue");

        // print student details
        student1.printDetails(false);
        student2.printDetails(true);
        student3.printDetails(false);
    }
}
