import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String guestList = "Guests' list: ";
        String moreGuests = "yes";

        do {
            //Write your solution here
            System.out.println("Please enter the guest's name:");
            String guest = input.nextLine();

            guestList += guest + ", ";

            System.out.println("Do you want to enter another guest's name? ");
            moreGuests = input.nextLine();

        } while (moreGuests.equalsIgnoreCase("yes")); // if the String is anything besides yes then the loop stops

        System.out.println(guestList);

    }
}