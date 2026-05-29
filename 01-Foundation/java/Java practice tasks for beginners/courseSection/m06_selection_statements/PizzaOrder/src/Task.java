public class Task {
    public static void main(String[] args) {

        char size  = 'S';
        char addPepperoni = 'Y';
        char extraCheese = 'Y';

        // ----Do not change below lines. needed for testing---
        size = args.length > 0 ? args[0].charAt(0) : size;
        addPepperoni = args.length > 0 ? args[1].charAt(0) : addPepperoni;
        extraCheese = args.length > 0 ? args[2].charAt(0) : extraCheese;
        //--------------------------------

        double price = 0;
        // double pepperoniPrice = 0, extraCheesePrice = 0;

        //Write your solution here
        price = size == 'S' ? 13.99 : size == 'M' ? 15.99 : 18.79;

        if(addPepperoni == 'Y'){
            // pepperoniPrice = size == 'S' ? 1.50 : size == 'M' ? 1.90 : 2.10;
            price += (size == 'S') ? 1.50 : (size == 'M') ? 1.90 : 2.10;
        }

        if(extraCheese == 'Y'){
            // extraCheesePrice = size == 'S' ? 1.25 : size == 'M' ? 1.65 : 2.00;
            price += (size == 'S') ? 1.25 : (size == 'M') ? 1.65 : 2.00;
        }

        System.out.println("The Total Price is: $" + price);

    }
}