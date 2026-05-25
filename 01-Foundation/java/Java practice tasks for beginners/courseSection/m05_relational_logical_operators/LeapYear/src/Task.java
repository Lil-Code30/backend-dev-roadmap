public class Task {
    public static void main(String[] args) {

        int year = 1900;
        // ----Do not change below lines. needed for testing---
        year = args.length > 0 ? Integer.parseInt(args[0]) : year;
        //--------------------------------

        //Write your solution here

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}