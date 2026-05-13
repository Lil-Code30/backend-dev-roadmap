/**
 * SoccerStatisticsClient.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Members in my group:
 * @author - I received help from ...
 *
 */
import java.util.Scanner;

public class SoccerStatisticsClient
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Create a player of the position of your group below to see if your code works as intended.


        /*SoccerTeam team1 = new SoccerTeam();
        System.out.print(team1);*/

        //DO NOT ALTER THE CODE BELOW!!! IT WILL BE USED TO TEST OUR PROGRAM!
        Defender[] defenders = new Defender[1];
        int[] interceptions = {4, 6};
        int[] ballRecoveries = {4, 9};
        defenders[0] = new Defender("Mike", interceptions, ballRecoveries);
        int[] saves = {4, 6};
        int[] goalsMade = {6, 4};
        GoalKeeper goalKeeper = new GoalKeeper("Liz", goalsMade, saves);
        Midfielder[] midfielders = new Midfielder[1];
        int[] interceptions1 = {3, 7};
        int[] ballRecoveries1 = {12, 4};
        midfielders[0] = new Midfielder("Jolie", interceptions1, ballRecoveries1);
        Striker[] strikers = new Striker[1];
        int[] bigChanceAttempt = {10, 10};
        int[] bigChanceMade = {5, 9};
        int[] goalsAttempted = {10, 10};
        int[] goalsScored = {5, 9};
        strikers[0] = new Striker("Izzy", bigChanceAttempt, bigChanceMade, goalsAttempted, goalsScored);
        int totalGames = 10;
        int gamesWon = 9;
        SoccerTeam team1 = new SoccerTeam("Unicorns", totalGames, gamesWon, goalKeeper, defenders, midfielders, strikers);
        System.out.print(team1);

        /*Use this code to read in from the user
        System.out.println("Please enter the name of your team: ");
        String teamNameInput /* TODO */
        System.out.println("Please enter the total number of games: ");
        int totalGamesInput /* TODO */
        in.nextLine();
        System.out.println("Please enter the total number of games won: ");
        int gamesWonInput /* TODO */
        in.nextLine();

        //Prompt the user and read in the information for the goalie. Initialize the goalie with values read in.
        /* TODO */
        //Create a new array of Defenders of size 3. Call the array defendersInput.
        /* TODO */
        //Loop through the array, prompt the user and read in the information for each defender. Initialize the defenders with values read in.
        /* TODO */
        //Create a new array of Midfielders of size 4. Call the array midfieldersInput.
       /* TODO */
        //Loop through the array, prompt the user and read in the information for each midfielder. Initialize the midfielders with values read in.
        /* TODO */
        //Create a new array of Strikers of size 3. Call the array strikersInput.
        /* TODO */
        //Loop through the array, prompt the user and read in the information for each striker. Initialize the strikers with values read in.
        /* TODO */
        ////Create a new SoccerTeam called team2 and initialize it with teamNameInput, totalGamesInput, gamesWonInput, goalieInput, defendersInput, midfieldersInput, and strikersInput.
       /* TODO */
        //Print out team2
        /* TODO */
    */
    }

}