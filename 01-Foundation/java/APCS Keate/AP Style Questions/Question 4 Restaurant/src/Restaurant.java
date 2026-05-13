/**
 * Restaurant.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class Restaurant {
    /** The weather readings from a location across specific times over multiple days */
    private String name;
    private Table[][] seating;

    /**
     * constructor
     * Preconditions: name != null, seating =! null
     * THE ENTIRE CONSTRUCTOR, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public Restaurant(String name, Table[][] seating)
    {
        this.name = name;
        this.seating = seating;
    }

    /**
     * Returns the index of a row containing the most occurrences of the status indicated by the parameter
     * target
     * Preconditions: seating ! = null and no elements of seating are null.
     *                seating.length >= 1 and seating[0].length >= 1
     */
    public int rowWithMost(String target)
    {
        /* TODO */
    }

    /* There may be instance variables, constructors, and methods that are not shown. */

}
