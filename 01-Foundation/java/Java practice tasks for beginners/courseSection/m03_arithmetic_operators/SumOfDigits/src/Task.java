public class Task {
    public static void main(String[] args) {
        int number = 123;

        // ----Do not change below lines. needed for testing---
        number = args.length > 0 ? Integer.parseInt(args[0]) : number;
        // ----------------------------------------------

        //Write your solution here

        String digits = String.valueOf(number);

        int digit1 = Integer.parseInt(digits.substring(0,1));
        int digit2 = Integer.parseInt(digits.substring(1,2));
        int digit3 = Integer.parseInt(digits.substring(2,3));
        System.out.println("Sum of the digits: " +digit1 + digit2 + digit3);

    }
}