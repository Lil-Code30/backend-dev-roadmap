/**
 * LotteryRevisited.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class LotteryRevisited {
    //instance variables
    private String lottoNumbers;

    //constructors
    /*No parameter constructor. Initialize the lottoNumbers randomly. Numbers cannot be chosen more than once. There
    * should be a trailing space*/
    public LotteryRevisited()
    {
        lottoNumbers = "";
        /*ToDo*/
    }
    /*Constructor with parameters. Initialize customers' lotto ticket according to the numbers they choose.Numbers cannot be chosen more than once. There
     * should be a trailing space*/
    public LotteryRevisited(int num1, int num2, int num3, int num4, int num5, int num6)
    {
        lottoNumbers = num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " ";
    }

    //getter method
    //Create the getter method to make sure lottoNumbers is accessible outside of the LotteryRevisited class.
    public String getLottoNumbers()
    {
        return lottoNumbers;
    }

    //mutator methods
    /*Check to see if two LotteryRevisited objects match. The method should take a LotteryRevisited object in as a parameter
    and should return true if all the customer's lotto numbers are included in the winning number (or vice versa), false if they do not.*/
    public boolean matches(LotteryRevisited other)
    {
        /*ToDo*/
    }

    /*Print whether the customer's ticket is a winner. The method should take a LotteryRevisited object in as a parameter.
     * You should use the matches method you just wrote in this method.*/
    public void checkTicket(LotteryRevisited other)
    {
        if(this.matches(other))
            System.out.println("You won the lottery!!");
        else
            System.out.println("You lost. Try again next week!");
    }
}
