/**
 * WeatherStation.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class WeatherStation {
    /** The weather readings from a location across specific times over multiple days */
    private WeatherReading[][] readings;

    /**
     * constructor
     * Preconditions: readings != null
     * THE ENTIRE CONSTRUCTOR, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public WeatherStation(WeatherReading[][] readings)
    {
        this.readings = readings;
    }

    /**
     * Returns the number of times the weather condition indicated
     * by the parameter target appears with at least one adjacent
     * cell (horizontally or vertically) also having the same condition as.
     * Preconditions: readings != null and no elements of readings are null.
     *                readings.length >= 1 and readings[0].length >= 1
     */
    public int countAdjacentPatterns(String target)
    {
        /* TODO */
    }

    /* There may be instance variables, constructors, and methods that are not shown. */
}
