import java.util.*;

public class Task {
    public static void main(String[] args) {

        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");

        int numberOfBedrooms = 0;

        // ----Do not change below lines. needed for testing---
        numberOfBedrooms = args.length > 0 ? Integer.parseInt(args[0]) : numberOfBedrooms;
        //--------------------------------

        //Write your solution here

        Scanner scanner = new Scanner(System.in);

        numberOfBedrooms = scanner.nextInt();

        switch(numberOfBedrooms){
            case 1:
                System.out.println("Starting price: 1100.");
                break;
            case 2:
                System.out.println("Starting price: 1850.");
                break;
            case 3:
                System.out.println("Starting price: 2550.");
                break;
            default:
                System.out.println("Sorry, we do not offer that many bedrooms");
        }
    }
}