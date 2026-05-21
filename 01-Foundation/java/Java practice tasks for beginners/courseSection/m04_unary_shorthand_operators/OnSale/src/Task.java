public class Task {
    public static void main(String[] args) {
        double currentPrice = 50.0;
        double discountPercentage = 5;

        // ----Do not change below lines. needed for testing---
        currentPrice = args.length > 0 ? Double.parseDouble(args[0]) : currentPrice;
        discountPercentage = args.length > 0 ? Double.parseDouble(args[1]) : discountPercentage;
        //--------------------------------

        //Write your solution here

        double discountAmount = currentPrice * 0.05;

        currentPrice -= discountAmount;

        System.out.println("Current price = " + currentPrice);
        System.out.println("Discount Amount = " + discountAmount);
    }
}