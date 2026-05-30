public class Task {
    public static void main(String[] args) {

        int n = 5;

        // ----Do not change below lines. needed for testing---
        n = args.length > 0 ? Integer.parseInt(args[0]) : n;
        //--------------------------------

        //Write your solution here

        int fact = 1;

        for(int i = n; i > 0 ; i--){
            fact *= i;
        }

        System.out.println("The factorial of " + n + " is: " + fact);


    }
}