/**
 * StudentClient.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
import java.util.Scanner;

public class StudentClient {
    public static void main(String[] args)
    {
        //Use this code to help you test what you have written.
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the student's first name: ");
        //Hint 7
        /* TODO */
        System.out.print("Please enter the student's last name: ");
        //Hint 7
        /* TODO */
        System.out.print("Please enter the students' ID number: ");
        //Hint 7
        /* TODO */
        in.nextLine();
        System.out.print("Please enter the student's expected graduation year: ");
        //Hint 7
        /* TODO */
        in.nextLine();
        System.out.print("Please enter the students' grades with a space in between each one (no + or -): ");
        String grades = in.nextLine();
        grades.trim();
        //Hint 8
        String[] gradesList = grades.split(" ");
        //Create a Student object, kid, with all the information above,
        /* TODO */
        System.out.println(kid);
        String[] gradesList2 = {"A", "A", "A", "A"};
        Student kid2 = new Student("Student", "Example", 20213456, gradesList2, 2021);
        Student kid3 = new Student("Student", "Example", 20213456, gradesList2, 2021);
        //Test the sameStudent method you wrote by calling it in the print statement.
        System.out.println("It is " + /* TODO */ + " that the sameStudent method works");


    }
}
