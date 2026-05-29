public class Task {
    public static void main(String[] args) {

        int number = 93;

        // ----Do not change below lines. needed for testing---
        number = args.length > 0 ? Integer.parseInt(args[0]) : 93;
        //--------------------------------

        //Write your solution here

        if((number % 3 == 0) && (number % 5 == 0)) {
            System.out.println("FINRA");
        } else if (number % 3 == 0) {
            System.out.println("FIN");
        } else if (number % 5 == 0) {
            System.out.println("RA");
        } else {
            System.out.println(number);
        }
    }
}