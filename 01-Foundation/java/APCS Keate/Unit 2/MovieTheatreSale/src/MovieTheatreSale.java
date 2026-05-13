/**
 * MovieTheatreSale.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
import java.util.*;

public class MovieTheatreSale {
  //instance variables
    private String movie;
    private String rating;
    private int time;
    private int totalTickets;
    private int adultTickets;
    public final double ADULT_TICKET_PRICE = 11.70;
    private int childTickets;
    public final double CHILD_TICKET_PRICE = 10.70;
    private int seniorTickets;
    public final double SENIOR_TICKET_PRICE = 11.20;
    private int matineeTickets;
    public final double MATINEE_TICKET_PRICE = 8.20;
    Scanner in = new Scanner(System.in);

    //constructor
    //Do not change
    public MovieTheatreSale(String movie, String rating, int time, int totalTickets, int matineeTickets, int adultTickets, int childTickets, int seniorTickets)
    {
        this.movie = movie;
        this.rating = rating;
        this.time = time;
        this.totalTickets = totalTickets;
        this.matineeTickets = matineeTickets;
        this.adultTickets = adultTickets;
        this.childTickets = childTickets;
        this.seniorTickets = seniorTickets;
    }


    //getter methods: Please fill in the getter methods below.

    public String getMovie() { /*ToDo*/}

    public String getRating()
    {
        /*ToDo*/
    }

    public int getShowtime()
    {
        /*ToDo*/
    }

    public int getTotalTickets()
    {
        /*ToDo*/
    }

    public int getMatineeTickets()
    {
        /*ToDo*/
    }

    public int getAdultTickets()
    {
        /*ToDo*/
    }

    public int getChildTickets()
    {
        /*ToDo*/
    }

    public int getSeniorTickets()
    {
        /*ToDo*/
    }

    //mutator methods

    /*Create a method, checkID, that records the customer's ID age is valid if the movie is rated R.
    The user should be asked to enter the birth year on the ID to test if the ID is valid.
    This method should return a boolean.
     */
    public boolean checkID()
    {
        System.out.println("Check ID (enter birth year): ");
        //Use the Scanner object in to read in the birth year and save it into the variable birthYear below.
        int birthYear = /*ToDo*/;
        in.nextLine();
        if(/*ToDo*/)
            return /*ToDo*/;
        else
            return /*ToDo*/;
    }

    /*Write a method, getTotalSale, to calculate and return the total sale for tickets for a customer.
    The sale should account for appropriate discounts when necessary.*/
    public double getTotalSale()
    {
        /*ToDo*/
    }

    //Do not change
    public String toString()
    {
        return ("Movie: " + movie + "\nRating: " + rating + "\nShowtime: " + time + "\nTotal Tickets: " + totalTickets +
                 "\nMatineeTickets: " + matineeTickets + "\nAdult Tickets: " + adultTickets + "\nChild Tickets: " + childTickets +
                "\nSenior Tickets: " + seniorTickets + "\nTotal Price: " + getTotalSale());
    }

}