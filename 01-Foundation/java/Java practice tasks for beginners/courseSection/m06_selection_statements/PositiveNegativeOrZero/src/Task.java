public class Task {
    public static void main(String[] args) {

        int num = 1;

        // ----Do not change below lines. needed for testing---
        num = args.length > 0 ? Integer.parseInt(args[0]) : num;
        //--------------------------------

        //Write your solution here

        if( num > 0){
            System.out.println(num + " is positive.");
        }else if (num < 0){
            System.out.println(num + " is negtive.");
        }else{
            System.out.println(num + " is zero.");
        }

    }
}