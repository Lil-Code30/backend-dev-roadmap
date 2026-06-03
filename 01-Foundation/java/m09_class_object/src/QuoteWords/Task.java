package QuoteWords;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        //Write your solution here
        /*
        * I will learn "$topic1" and "$topic2" at Cydeo.
        Ex:
          Input:
            Java
            SQL

          Output:
            I will learn "Java" and "SQL" at Cydeo.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first topic: ");
        String topic1 = sc.nextLine();
        System.out.print("Enter the second topic: ");
        String topic2 = sc.nextLine();

        System.out.println("I will learn \"" + topic1 + "\" and \"" + topic2 + "\" at Cydeo.");

    }
}