public class Task {
    public static void main(String[] args) {

        int speedLimit = 55;
        int currentSpeed = 85;

        // ----Do not change below lines. needed for testing---
        speedLimit = args.length > 0 ? Integer.parseInt(args[0]) : speedLimit;
        currentSpeed = args.length > 0 ? Integer.parseInt(args[1]) : currentSpeed;
        //--------------------------------

        int ticketAmount = 0;

        //Write your solution here

        if(currentSpeed > speedLimit) {
            ticketAmount =  (currentSpeed - speedLimit) * 6 + 51;

            System.out.println("Ticket Amount = $" + ticketAmount);
        }else{
            System.out.println("Not speeding");
        }

    }
}