/**
 * Lottery.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class Lottery {
    //instance variables
    private String lottoNumbers;

    //constructors
    /*No parameter constructor. Initialize the lottoNumbers randomly. Numbers can be chosen more than once.*/
    public Lottery()
    {
        lottoNumbers = "";
        /*ToDo*/
    }
    //Constructor with parameters. Initialize customers' lotto ticket according to the numbers they choose.
    public Lottery(int num1, int num2, int num3, int num4, int num5, int num6)
    {
        /*ToDo*/
    }

    //getter method
    //Create the getter method to make sure lottoNumbers is accessible outside of the Lottery class.
    public String getLottoNumbers()
    {
        /*ToDo*/
    }

    //mutator methods
    /*Check to see if two Lottery objects are the match. The method should take a Lottery object in as a parameter
    and should return true if the two lotto numbers match, false if they do not.*/
    public boolean matches(Lottery other)
    {
/*ToDo*/
    }

    /*Print whether the customer's ticket is a winner. The method should take a Lottery object in as a parameter.
    * You should use the matches method you just wrote in this method.*/
    public void checkTicket(Lottery other)
    {
        /*ToDo*/
    }
}
