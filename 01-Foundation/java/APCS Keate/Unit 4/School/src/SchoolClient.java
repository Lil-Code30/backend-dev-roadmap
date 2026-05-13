/**
 * SchoolClient.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
import java.util.*;
public class SchoolClient {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Use this code to help you test what you have written.
        System.out.println("Please enter the year of the first student as an integer between 1 & 4 (1 = freshman, 2 = sophomore, 3 = junior, 4 = senior) or any other number to quit: ");
        int year = in.nextInt();
        in.nextLine();
        ArrayList<Student> year1 = new ArrayList<>();
        ArrayList<Student> year2 = new ArrayList<>();
        ArrayList<Student> year3 = new ArrayList<>();
        ArrayList<Student> year4 = new ArrayList<>();
        //Hint 13
        while(/* TODO */)
        {
            //Copy and paste the code to create a student with user input from the StudentClient class of the Student Lab.
            /* TODO */
            //Create a Student object, kid, with all the information above,
            /* TODO */
            //Hint 13
            /* TODO */
            //Hint 14
            /* TODO */
        }
        School school = new School(year1, year2, year3, year4);
        System.out.println("School Roster: ");
        System.out.println("Freshmen: ");
        ArrayList<Student> frosh = school.getYear1();
        for(Student kid: frosh)
            System.out.println(kid);
        System.out.println("Sophomores: ");
        ArrayList<Student> soph = school.getYear2();
        for(Student kid: soph)
            System.out.println(kid);
        System.out.println("Juniors: ");
        ArrayList<Student> junior = school.getYear3();
        for(Student kid: junior)
            System.out.println(kid);
        System.out.println("Seniors: ");
        ArrayList<Student> senior = school.getYear4();
        for(Student kid: senior)
            System.out.println(kid);
        System.out.println("The average GPA of the school is " + school.calcSchoolAverageGpa());
        System.out.println("Dean's List:");
        ArrayList<Student> deans = school.deansList();
        for(Student kid: deans)
            System.out.println(kid.getLastName() + ", " + kid.getFirstName());
        school.removeDoubles();
        System.out.println("School Roster with Doubles removed: ");
        System.out.println("Freshmen: ");
        for(Student kid: frosh)
            System.out.println(kid);
        System.out.println("Sophomores: ");
        for(Student kid: soph)
            System.out.println(kid);
        System.out.println("Juniors: ");
        for(Student kid: junior)
            System.out.println(kid);
        System.out.println("Seniors: ");
        for(Student kid: senior)
            System.out.println(kid);
    }
}
