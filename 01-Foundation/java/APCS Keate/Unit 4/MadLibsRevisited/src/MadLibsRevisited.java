/**
 * MadLibsRevisited.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class MadLibsRevisited {
   //instance variables
   private String[] nouns;
   private String[] pluralNouns;
   private String[] verbsEndingInING;
   private String[] adverbs;
   private String[] verbs;
   private String[] adjectives;
   private String[] places;
   private String story;
   //constructor
   public MadLibsRevisited(String[] pluralNouns, String[] nouns, String[] verbsEndingInING, String[] adverbs, String[] verbs, String[] adjectives, String[] places, String story)
   {
      /*Initialize the arrays and fill them with user input. Change the names of the lists to match your missing parts
      * of speech when needed.*/
      this.pluralNouns = pluralNouns;
      this.nouns = nouns;
      this.verbsEndingInING = verbsEndingInING;
      this.adverbs = adverbs;
      this.verbs = verbs;
      this.adjectives = adjectives;
      this.places = places;
      //Initialize story to fill it with the provided String from the file chosen in the client class.
      this.story = story;
   }

   //getter methods
   private void printNouns()
   {
      //Print the list of nouns in one line.
      System.out.print("Nouns: ");
      /*ToDo*/
   }

   private void printPluralNouns()
   {
      //Print the list of plural nouns in one line.
      System.out.print("Plural Nouns: ");
      /*ToDo*/
   }

   private void printVerbs()
   {
      //Print the list of verbs in one line.
      System.out.print("Verbs: ");
      /*ToDo*/
   }

   private void printVerbsEndingInING()
   {
      //Print the list of verbs ending in -ing in one line.
      System.out.print("Verbs ending in -ing: ");
      /*ToDo*/
   }

   private void printAdjectives()
   {
      //Print the list of adjectives in one line.
      System.out.print("Adjectives: ");
      /*ToDo*/
   }

   private void printAdverbs()
   {
      //Print the list of adverbs in one line.
      System.out.print("Adverbs: ");
      /*ToDo*/
   }

   private void printPlaces()
   {
      //Print the list of places in one line.
      System.out.print("Places: ");
      /*ToDo*/
   }

   public void printLists()
   {
      //Print all lists out in separate lines.
      /*ToDo*/
   }

   //mutator methods
   public String createStory()
   {
      //Create a String array of the parts of story divided at PLURALNOUN.
      /* TODO */
      //Reset story to "" so you can add back onto it. The parts of the story are saved in storyWithoutPluralNouns.
      /* TODO */
      //Make a loop to go through the pluralNouns list.
      /* TODO */
      {
         //Add each element of storyWithoutPluralNouns and pluralNouns to story.
         /* TODO */
      }
      /*Add the final element of storyWithoutPluralNouns to story. There is one more element in storyWithoutPluralNouns,
      * the last part of the story after the last occurrence of PLURALNOUN*/
      /* TODO */
      /* TODO */
   }
}