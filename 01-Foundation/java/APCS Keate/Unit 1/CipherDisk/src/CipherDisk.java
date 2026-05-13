/**
 * CipherDisk.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class CipherDisk
{
    //instance variables
    private char startLetter;

    //constructor
    public CipherDisk(char startLetter)
    {
        this.startLetter = startLetter;
    }

    //no parameter constructor
    public CipherDisk()
    {
        this.startLetter = 'A';
    }

    //getter methods
    public char getStartLetter()
    {
        return startLetter;
    }

    //mutator method
    /** Translates the given phrase into a cryptogram using startLetter
     * Preconditions: phrase only contains capital letters and spaces.
     */
    public String codePhrase(String phrase)
    {
        //At the end of this, code will hold the coded phrase.
        String code = "";
        //Loops do repeated behaviors. We will learn how to code these in later units.
        while(phrase.length() > 0)
        {
            //Pull the first letter out of phrase.
            String letter /* TODO */
            //Store the letter as a char.
            char letterInChar /* TODO */
            //Conditionals are used to make decisions. We will learn how to code these in later units.
            //Test if the letterInChar is a space.
            if(/* TODO */) {
                //Find the ASCII code value of the new letter by using start letter.
                int codeLetterAscii /* TODO */
                //Test if the letter is not a capital letter using ASCII code values.
                if (codeLetterAscii /* TODO */) {
                    //If the ASCII value is too high, make an adjustment, so it will be within 65 (A) and 90 (Z)
                    codeLetterAscii /* TODO */
                }
                //Add the new char to code.
                /* TODO */
            }
            //Conditionals are used to make decisions. We will learn how to code these in later units.
            else
                //Add the new char (space) to code.
                /* TODO */
            //Shorten phrase to everything but the first character.
            phrase /* TODO */
        }
        return code;
    }
}