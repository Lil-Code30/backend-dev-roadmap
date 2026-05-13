/**
 * MadLibsRevisedClient.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class MadLibsRevisitedClient {
    //Throw a specific exception related to reading in from a file.
    public static void main(String[] args) throws /* TODO */
    {
        File file = new File("Unit 4//MadLibsRevisited//src//Video Game Mayhem Mad Lib.txt");
        Scanner fromFile = new Scanner(file);
        String storyFromFile = "";
        while(fromFile.hasNext())
        {
            storyFromFile += fromFile.nextLine() + "\n";
        }
        fromFile.close();
        System.out.println(storyFromFile);
        Scanner in = new Scanner(System.in);
        /*Create a loop to continue asking the user if they would like to create a new story.
        * If the user types any version of the word "no" the loop should end so that a story will not be written.*/
        //Prompt the user to ask if they want to play
        /*ToDo*/
        //Read in whether the user wants to play.
        /*ToDo*/
        //Trim the user's response.
        /*ToDo*/
        //Create the loop
        /*ToDo*/
        {
            /*Initialize all the arrays and fill them with user input. If the story you chose is not missing that part
            * of speech, set the length of the array to 0 but still read in user input. Changes names of the lists when needed.*/
            String[] nouns = new String[/* TODO */];
            for(/* TODO */)
            {
                System.out.print("Please enter a noun: ");
                nouns[i] = in.next();
            }
            String[] pluralNouns = new String[/* TODO */];
            for(/* TODO */)
            {
                System.out.print("Please enter a plural noun: ");
                pluralNouns[i] /* TODO */
            }
            String[] verbs = new String[/* TODO */];
            for(/* TODO */)
            {
                System.out.print("Please enter a verb: ");
                verbs[i] /* TODO */
            }
            String[] verbsEndingInING = new String[/* TODO */];
            for(/* TODO */)
            {
                System.out.print("Please enter a verb ending in -ing: ");
                verbsEndingInING[i] /* TODO */
            }
            String[] adjectives = new String[/* TODO */];
            for(/* TODO */)
            {
                System.out.print("Please enter an adjective: ");
                adjectives[i] /* TODO */
            }
            String[] adverbs = new String[/* TODO */];
            for(/* TODO */)
            {
                System.out.print("Please enter an adverb: ");
                adverbs[i] /* TODO */
            }
            String[] places = new String[/* TODO */];
            for(/* TODO */)
            {
                System.out.print("Please enter a place: ");
                places[i] /* TODO */
            }
            //Create a new MadLibs story object.
            /*ToDo*/
            //Call the printLists method to make sure all the words entered are in the correct list.
            /*ToDo*/
            System.out.println();
            //Call the createStory method to print out the story.
            /*ToDo*/
            //Prompt the user to ask if they want to continue playing.
            /*ToDo*/
            //Read in whether the user wants to play.
            /*ToDo*/
            //Trim the user's response.
            /*ToDo*/
        }
    }
}
