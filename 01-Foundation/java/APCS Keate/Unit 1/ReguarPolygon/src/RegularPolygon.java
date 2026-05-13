/**
 * RegularPolygon.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class RegularPolygon
{
    //instance variables
    private int s;
    private int n;

    //constructor
    public RegularPolygon(int s, int n)
    {
        this.s = s;
        this.n = n;
    }
    //getter methods
    public int getNumSides()
    {
        return n;
    }

    public int getSideLength()
    {
        return s;
    }
    //mutator methods
    public double interiorAngle()
    {
        //Use the given formula to calculate the interior angle of the regular polygon.
                return /*ToDo*/
    }

    public double exteriorAngle()
    {
        //Use the given formula to calculate the interior angle of the regular polygon.
        return /*ToDo*/
    }

    public double area()
    {
        //Use the formula to calculate the area of the regular polygon.
        double area = /*ToDo*/
        area = Math.round(area*100.0)/100.0;
        return area;
    }

    //NOTE: Do not change this code!!
    public String toString()
    {
        return "A regular polygon with " + getNumSides() + " sides of length " +
                getSideLength() + " has an interior angle measurement of " + interiorAngle() + " degrees, " +
                "an exterior angle measurement of " + exteriorAngle() + " degrees, and an area of " + area() + ".";
    }
}
