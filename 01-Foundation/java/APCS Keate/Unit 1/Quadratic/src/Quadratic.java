/**
 * Quadratic.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class Quadratic {
    //instance variables
    private double a;
    private double b;
    private double c;

    //constructor
    public Quadratic(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //mutator method
    public String findRoots()
    {
        //Find root1 using the + of the +/- in the quadratic equation
        double root1 = /*ToDo*/
        root1 = (double)Math.round(root1*100)/100;
        //Find root2 using the - of the +/- in the quadratic equation
        double root2 = /*ToDo*/
        root2 = (double) Math.round(root2*100.0)/100.0;
        //Do not alter the code below in any way.
        String message = "The roots for a quadratic with coefficients a = " + a + " b = " + b + " and c = " + c;
        message += " are " + root1 + " and " + root2 + ".";
        return message;
    }
}
