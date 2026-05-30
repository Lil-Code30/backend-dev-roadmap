public class Task {
    public static void main(String[] args) {

        int day = 1;

        // ----Do not change below lines. needed for testing---
        day = args.length > 0 ? Integer.parseInt(args[0]) : day;
        //--------------------------------

        //Write your solution here

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No such day");
        }
    }
}