public class EmployeeInfo {
    /**
     * instance variables
     * THESE VARIABLES WOULD NOT BE SHOWN ON THE AP TEST.
     */
    private String id;
    private int years;
    private boolean isFullTime;

    /**
     * constructor
     * Preconditions: id != null
     *                 years >= 0
     * THE ENTIRE CONSTRUCTOR, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public EmployeeInfo(String id, int years, boolean isFullTime)
    {
        this.id = id;
        this.years = years;
        this.isFullTime = isFullTime;
    }

    /**
     * Returns the id of the employee
     */
    public String getEmployeeID()
    { return id; }

    /**
     * Returns the duration of the video in minutes
     */
    public double getYearsExperience()
    { return years; }

    /**
     * Returns true if the video is currently published and
     * returns false otherwise
     */
    public boolean isFullTime()
    { return isFullTime; }

    /* There may be instance variables, constructors, and methods that are not shown. */
}