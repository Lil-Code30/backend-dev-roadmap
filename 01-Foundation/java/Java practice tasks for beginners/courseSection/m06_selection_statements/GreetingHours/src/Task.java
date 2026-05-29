public class Task {
    public static void main(String[] args) {

        int hour = 1;

        // ----Do not change below lines. needed for testing---
        hour = args.length > 0 ? Integer.parseInt(args[0]) : hour;
        //--------------------------------

        //Write your solution here

        if(hour >= 5 && hour <= 11) {
            System.out.print("Good morning");
        } else if(hour >= 12 && hour <= 17){
            System.out.println("Good afternoon");
        } else if((hour >= 18 && hour <= 23) || (hour >= 0 && hour <= 5)) {
            System.out.println("Good evening");
        }else{
            System.out.println("Invalid hour");
        }
    }
}