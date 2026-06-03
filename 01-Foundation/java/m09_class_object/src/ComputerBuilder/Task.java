package ComputerBuilder;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        /*
        * Create a program that will build a custom laptop by allowing the user to select each part and computing the total price.

        Scanner code is already included, please fill out conditions for the price.

        Use the following requirements for each section:

        First ask the user about the screen size
            Select screen size:
            - For a screen size of `13.3`, add `$200` to the total price
            - For a screen size of `15.0`, add `300` to the total price
            - For screen size of `17.3`, add `$400` to the total price

        Then ask the user about the CPU
            Select CPU type:
            - For a CPU of `i5`, add `$250` to the total price
            - For a CPU of `i7`, add `$350` to the total price
            - For a CPU of `i3`, add `$150` to the total price

        Then ask the user about the RAM size
            Select RAM size:
            - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4

        Then ask the user about the storage type and amount
            Select storage type:
            - For `HDD`, add `$50` to the total price for every 500GB
            - For `SSD`, add `$100` to the total price for every 500GB

        Then ask the user about the screen resolution
            Select screen resolution:
            - For `FULLHD`, add `$100` to the total price
            - For `4K`, add `$200` to the total price

        At the end display the total price of the custom computer
            Final price is: $amount

        Example Flow:
          Select screen size:
            13.3
          Select CPU type:
            i7
          Select RAM size:
            8
          Select storage type:
            SSD
          Select storage size:
            1000
          Select screen resolution:
            4K
          Final price is: $1050.0
        * */

        Scanner input = new Scanner(System.in);
        double totalPrice = 0;

        System.out.println("Select the screen size ('13.3' or '15.0' or '17.3'):");
        double screenSize = input.nextDouble();

        //Add cost to totalPrice based on screenSize
        // totalPrice += screenSize == 13.3 ? 200 : screenSize == 15.0 ? 300 : 400;
        if(screenSize == 13.3){
            totalPrice += 200;
        } else if (screenSize == 15.0){
            totalPrice += 300;
        }else if (screenSize == 17.3){
            totalPrice += 400;
        }else{
            System.out.println("Invalid Screen Size");
        }

        System.out.println("Select CPU type ('i3' or 'i5' or 'i7')");
        String cpu = input.next();

        //Add cost to totalPrice based on cpu
        if(cpu.equals("i3")){
            totalPrice += 150;
        } else if (cpu.equals("i5")){
            totalPrice += 250;
        }else if (cpu.equals("i7")){
            totalPrice += 350;
        }else{
            System.out.println("Invalid CPU type");
        }

        System.out.println("Select RAM size");
        int ram = input.nextInt();

        //Add cost to totalPrice based on ram
        // ex. ram = 8; 8 / 4 = 2 ; 2 * 50 = 100
        // ex. ram = 16; 16 / 4 = 4; 4 * 50 = 200
        totalPrice += ((double)(ram / 4) * 50);

        System.out.println("Select storage type");
        String storageType = input.next();

        System.out.println("Select storage amount");
        int storageAmount = input.nextInt();

        //Add cost to totalPrice based on storageType and storageAmount

        if(storageType.equals("HDD")){
            totalPrice += ((double)(storageAmount / 500) * 50);
        }else if(storageType.equals("SSD")){
            totalPrice += ((double)(storageAmount / 500) * 100);
        }else{
            System.out.println("Invalid storage type");
        }

        System.out.println("Select screen resolution:");
        String resolution = input.next();

        //Add to totalPrice based on resolution
        if(resolution.equals("FULLHD")){
            totalPrice += 100;
        }else if(resolution.equals("4k")){
            totalPrice += 200;
        }

        System.out.println("Final price is: $" + totalPrice);


    }
}