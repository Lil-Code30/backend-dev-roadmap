/**
 * EmployeeDirectory.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
import java.util.ArrayList;
public class EmployeeDirectory {
    /** The list of all employees on the human resources platform */
    private ArrayList<EmployeeInfo> employees;

    /**
     * constructor
     * Preconditions: employees != null
     * THE ENTIRE CONSTRUCTOR, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public EmployeeDirectory(ArrayList<EmployeeInfo> employees)
    {
        this.employees = employees;
    }

    /**
     * Returns the id of the first full-time employee whose years of experience are between
     * minYears and maxYears, inclusive. If no employee in employees with these specifications exists, return null.
     * Precondition: minYears <= maxYears
     *                No elements of employees are null.
     * Postcondition: employees is unchanged.
     */
    public String findFirstQualified(double minYears, double maxYears)
    {
        /* TODO */
    }

    /* There may be instance variables, constructors, and methods that are not shown. */

}
