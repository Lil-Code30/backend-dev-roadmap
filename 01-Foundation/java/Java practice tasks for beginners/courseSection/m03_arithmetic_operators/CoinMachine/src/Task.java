public class Task {
    public static void main(String[] args) {

        int coins = 467;
        // ----Do not change below lines. needed for testing---
        coins = args.length > 0 ? Integer.parseInt(args[0]) : coins;
        // -------------------------------------

        System.out.println("coins = " + coins);

        //Add your solution here

        int dollars, quarters, dimes, nickels, cents, remainder;


        dollars = coins / 100;
        remainder = coins % 100;
        quarters = remainder / 25;
        remainder = remainder % 25;
        dimes = remainder / 10;
        remainder = remainder % 10;
        nickels = remainder / 5;
        remainder = remainder % 5;
        cents = remainder;

        System.out.println("dollars = " + dollars);
        System.out.println("quarters = " + quarters);
        System.out.println("dimes = " + dimes);
        System.out.println("nickels = " + nickels);
        System.out.println("cents = " + cents);
    }
}