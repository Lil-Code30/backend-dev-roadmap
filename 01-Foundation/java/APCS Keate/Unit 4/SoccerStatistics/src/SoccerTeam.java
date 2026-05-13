/**
 * SoccerTeam.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Members in my group:
 * @author - I received help from ...
 *
 */
import java.util.Scanner;
public class SoccerTeam {
    private GoalKeeper goalie;
    private Defender[] defenders;
    private Midfielder[] midfielders;
    private Striker[] strikers;
    private String name;
    private int gamesWon;
    private int totalGames;
    Scanner in = new Scanner(System.in);

    public SoccerTeam(String name, int totalGames, int gamesWon, GoalKeeper goalie, Defender[] defenders, Midfielder[] midfielders, Striker[] strikers)
    {
        this.name = name;
        this.totalGames = totalGames;
        this.gamesWon = gamesWon;
        this.goalie = goalie;
        this.defenders = defenders;
        this.midfielders = midfielders;
        this.strikers = strikers;
    }

    //DO NOT ALTER THIS CODE!
    public String toString()
    {
        String teamInfo = name + "\n";
        teamInfo += "Games Played: " + totalGames + "\n";
        teamInfo += "Games Won: " + gamesWon + "\n";
        teamInfo += "Win Percentage: + " + ((double)gamesWon/totalGames) + "\n";
        teamInfo += "Goal Keeper: " + goalie.getName() + ", Save Percentage: " + goalie.savePercentage() + "\n";
        for(int i = 0; i < defenders.length; i++)
            teamInfo += "Defender: " + defenders[i].getName()+ ", Average Interceptions per Game: " + defenders[i].averageInterceptions()+ ", Average Ball Recoveries per Game: " + defenders[i].averageBallRecoveries() + "\n";
        for(int i = 0; i < midfielders.length; i++)
            teamInfo += "Midfielder: " + midfielders[i].getName() + ", Average Interceptions per Game: " + midfielders[i].averageInterceptions()+ ", Average Ball Recoveries per Game: " + midfielders[i].averageBallRecoveries() + "\n";
        for(int i = 0; i < strikers.length; i++)
            teamInfo += "Striker: " + strikers[i].getName() + ", Goal Percentage: " + strikers[i].goalPercentage()+ ", Big Chance Percentage: " + strikers[i].bigChancePercentage() + "\n";
        return teamInfo;
    }
}
