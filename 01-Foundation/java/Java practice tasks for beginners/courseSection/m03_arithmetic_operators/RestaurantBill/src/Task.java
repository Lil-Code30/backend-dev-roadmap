public class Task {
    public static void main(String[] args) {

        double bill = 50.0;
        double tipPercentage = 10;

        // ----Do not change below lines. needed for testing---
        bill = args.length > 0 ? Double.parseDouble(args[0]) : bill;
        tipPercentage = args.length > 0 ? Double.parseDouble(args[1]) : tipPercentage;
        //--------------------------------

        //Write your solution here

        double tip = (tipPercentage / 100 * bill);
        double tax = bill * 0.05;
        double totalBill = bill + tip + tax;

        System.out.println("Your Complete bill");
        System.out.println("bill:\t" + bill);
        System.out.println("tip:\t" + tip);
        System.out.println("tax:\t" + tax);
        System.out.println("total bill:\t" + totalBill);

    }
}