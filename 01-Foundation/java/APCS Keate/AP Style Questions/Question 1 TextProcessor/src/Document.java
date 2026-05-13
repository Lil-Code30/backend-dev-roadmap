public class Document {
    /**
     * instance variables
     * THESE VARIABLES WOULD NOT BE SHOWN ON THE AP TEST.
     */
    private String title;
    private String[] sections;

    /**
     * constructor
     * Preconditions: sections.length != null
     * THE ENTIRE CONSTRUCTOR, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public Document(String title, String[] sections)
    {
        this.title = title;
        this.sections = sections;
    }

    /**
     * Returns the text content of the section at the specified index
     * Precondition: 0 <= sectionIndex < total number of sections in this document
     */
    public String getSectionText(int sectionIndex)
    { return sections[sectionIndex - 1]; }

    /**
     * Returns the word count of the section at the specified index
     * Precondition: 0 <= sectionIndex < total number of sections in this document
     */
    public int getSectionWordCount(int sectionIndex)
    {
        String[] words = (sections[sectionIndex - 1].split(" "));
        return words.length;
    }

    /**
     * Returns the total number of sections in this document
     */
    public int getSectionCount()
    { return sections.length; }

    /**
     * Returns the title of this document
     */
    public String getTitle()
    { return title; }

    /**
     * Sets the title of this document
     * Preconditions: t != null
     * THE ENTIRE METHOD, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public void setTitle(String t)
    {
        title = t;
    }

    /* There may be instance variables, constructors, and methods that are not shown. */

}
