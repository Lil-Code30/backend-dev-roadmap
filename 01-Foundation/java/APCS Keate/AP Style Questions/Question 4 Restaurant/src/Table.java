public class Table {
    /**
     * instance variables
     * THESE VARIABLES WOULD NOT BE SHOWN ON THE AP TEST.
     */
    private String status;
    private int capacity;

    /**
     * constructor
     * Preconditions: status != null
     * THE ENTIRE CONSTRUCTOR, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public Table(String status, int capacity)
    {
        this.status = status;
        this.capacity = capacity;
    }

    /**
     * Returns the status of the table ("available", "occupied", "reserved", etc.)
     */
    public String getStatus()
    { return status; }

    /**
     * Returns the maximum number of people the table can seat
     */
    public int getCapacity()
    { return capacity; }

    public String toString()
    {
        return status + " " + capacity;
    }

    /* There may be instance variables, constructors, and methods that are not shown. */

}