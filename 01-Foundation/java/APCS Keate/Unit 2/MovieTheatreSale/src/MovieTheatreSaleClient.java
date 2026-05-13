/**
 * MovieTheatreSaleClient.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
import java.util.*;
public class MovieTheatreSaleClient {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Movie: ");
        //Use the Scanner object in to read in the movie title and save it into the variable movie of type String.
        /* TODO */
        System.out.println("Rating: ");
        //Use the Scanner object in to read in the movie rating and save it into the variable rating of type String.
        /* TODO */
        //Trim the rating to eliminate any extra spaces.
        /* TODO */
        System.out.println("Showtime (in military time format, 2:00 pm is entered as 14:00): ");
        String timeIn = in.nextLine();
        timeIn = timeIn.trim();
        int colon = timeIn.indexOf(":");
        int timeHours = Integer.decode(timeIn.substring(0,colon));
        int timeMinutes = Integer.decode(timeIn.substring(colon+1));
        /*Calculate the time into a variable named time of type int. If the user entered 15:00, you should get 1500.
        The hours and minutes have already been saved in the 2 lines just above this.
         */
        /* TODO */
        //Declaring all types of tickets for use below.
        int matineeTickets, adultTickets, childTickets, seniorTickets, totalTickets;
        /*Use an if - else statement check the time and determine if the show is a matinee showing (before 2:00pm).
         */
        if(/* TODO */) {
            System.out.println("Total number of tickets: ");
            //Use the Scanner object in to read in the total number of tickets and save it in the variable declared above.
            /* TODO */
            in.nextLine();
            //The total number of tickets should also be the value of the instance variable for total number of matinee tickets as this is the cheapest discount.
            /* TODO */
            /*The rest of the  variables for the types of tickets should be set to zero (you will not need to ask the user how many of each
            type of these there are).*/
            /* TODO */
        }
        /*For any showing after 2:00pm, the number of matinee tickets should be set to zero and
        you will need to ask for the number of each type of ticket.*/
        else {
            //The variable for number of matinee tickets should be set to zero.
            /* TODO */
            System.out.println("Total number of tickets: ");
            //Use the Scanner object in to read in the total number of tickets and save it into the variable for it declared above.
            /* TODO */
            in.nextLine();
            System.out.println("Number of adult tickets: ");
            //Use the Scanner object in to read in the total number of adult tickets and save it into the variable for it declared above
            /* TODO */
            in.nextLine();
            System.out.println("Number of child tickets: ");
            //Use the Scanner object in to read in the total number of child tickets and save it into the variable for it declared above
            /* TODO */
            in.nextLine();
            System.out.println("Number of senior tickets: ");
            //Use the Scanner object in to read in the total number of senior tickets and save it into the variable for it declared above
            /* TODO */
            in.nextLine();
            /*Check to see if the number of adult, children, and senior tickets add up to the total number of tickets
            If not, the output window should display that the number of tickets do not match and the program needs to be
            rerun. Then, exit the program. */
            if(/* TODO */) {
                System.out.println("Your number of number of adult, children, and senior tickets do not add up to the total number of " +
                        "tickets. Please start over.");
                System.exit(1);
            }
        }
        /*Create a MovieTheatreSale object called sale.*/
        /*ToDo*/
        /*Check if the rating is R or r here. If so, you will need to check the customer's ID.*/
        if(/*ToDo*/)
        {
            /*Use checkID here. If the person is too young, the output window should display this and the
             * program should terminate.*/
            if(/*ToDo*/)
            {
                /*ToDo*/
            }
        }
        //Do not change (it will help you check your code).
        System.out.print(sale);
    }
}
