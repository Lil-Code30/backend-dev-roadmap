public class Task {
    public static void main(String[] args) {

        int first = 5;
        int second = 30;
        int third = 50;

        // ----Do not change below lines. needed for testing---
        first = args.length > 0 ? Integer.parseInt(args[0]) : first;
        second = args.length > 0 ? Integer.parseInt(args[1]) : second;
        third = args.length > 0 ? Integer.parseInt(args[2]) : third;
        //--------------------------------
        int middle;

        //Write your solution here

        if((first < second && first > third) || (first < third && first > second)){
            middle = first;
        } else if((second < first && second > third) || (second < third && second > first)){
            middle = second;
        }else{
            middle = third;
        }

        System.out.println("The middle number is: " + middle);

    }
}