import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a command: ");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.println("Your request is being processed");
        }else if (response == 'n'){
            System.out.println("Thank you for your consideration");
        }else if(response == 'h'){
            System.out.println("Sorry, no live agents are currently available");
        }else{
            System.out.println("Invalid entry, please try again");
        }

    }
}