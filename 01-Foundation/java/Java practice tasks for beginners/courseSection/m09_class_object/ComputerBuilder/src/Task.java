import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalPrice = 0;

        System.out.println("Select the screen size");
        double screenSize = input.nextDouble();

        //Add cost to totalPrice based on screenSize

        System.out.println("Select CPU type");
        String cpu = input.next();

        //Add cost to totalPrice based on cpu

        System.out.println("Select RAM size");
        int ram = input.nextInt();

        //Add cost to totalPrice based on ram

        System.out.println("Select storage type");
        String storageType = input.next();

        System.out.println("Select storage amount");
        int storageAmount = input.nextInt();

        //Add cost to totalPrice based on storageType and storageAmount

        System.out.println("Select screen resolution:");
        String resolution = input.next();

        //Add to totalPrice based on resolution

        System.out.println("Final price is: $" + totalPrice);


    }
}