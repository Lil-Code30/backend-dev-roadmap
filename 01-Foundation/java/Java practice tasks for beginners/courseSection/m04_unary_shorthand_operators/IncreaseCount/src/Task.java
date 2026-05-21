public class Task {
    public static void main(String[] args) {

        int count = 5;
        //Do not change below line:needed for testing---
        count = args.length > 0 ? Integer.parseInt(args[0]) : count;

        // Write your solution here

        // arithmetic operator
        count = count + 1;

        // unary increment operator
        count++;

        // shorthand operator
        count += 1;

        System.out.println("Count = " + count);
    }
}