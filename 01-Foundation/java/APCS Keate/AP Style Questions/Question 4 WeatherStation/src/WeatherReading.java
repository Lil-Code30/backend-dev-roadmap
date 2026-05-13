public class WeatherReading {
    /**
     * instance variables
     * THESE VARIABLES WOULD NOT BE SHOWN ON THE AP TEST.
     */
    private String condition;
    private int temperature;

    /**
     * constructor
     * Preconditions: condition != null
     * THE ENTIRE CONSTRUCTOR, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public WeatherReading(String condition, int temperature)
    {
        this.condition = condition;
        this.temperature = temperature;
    }

    /**
     * Returns the weather condition ("sunny", "cloudy", "rainy", "snowy", etc.)
     */
    public String getCondition()
    { return condition; }

    /**
     * Returns the temperature in degrees Fahrenheit
     */
    public int getTemperature()
    { return temperature; }

    public String toString()
    {
        return condition + " " + temperature;
    }

    /* There may be instance variables, constructors, and methods that are not shown. */
}