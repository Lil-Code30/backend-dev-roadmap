/**
 * TextProcessor.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class TextProcessor {
    /** The document this processor analyzes */
    private Document document;

    /**
     * constructor
     * Preconditions: document != null
     * THE ENTIRE CONSTRUCTOR, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public TextProcessor(Document doc)
    {
        document = doc;
    }

    /**
     * Analyzes sections and calculates a quality score based on word counts
     * and number of occurrences of targetWord, as described in part (a)
     * Preconditions: minWords >= 0; maxWords >= minWords
     *                targetWord != null
     */
    public int calculateQualityScore(int minWords, int maxWords, String targetWord)
    {
        /* TODO */
    }

    /**
     * Creates and returns a modified version of the document title by
     * replacing a specified word, as described in part (b)
     * Preconditions: oldWord.length() > 0; newWord.length() > 0
     *                the document title contains at least one occurrence of oldWord
     */
    public String replaceInTitle(String oldWord, String newWord)
    {
        /* TODO */
    }
    /* There may be instance variables, constructors, and methods that are not shown. */

}