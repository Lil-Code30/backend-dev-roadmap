/**
 * Christmas.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class Christmas {

    /** Prints out the day of the week of Christmas when given the start day of December.
     * Preconditions: startDayOfTheMonth >= 0 && satrtDayOfTheMonth <= 6
     *                  0 corresponds to Sunday, 1 to Monday, and so on.
     */
    public static String getDayOfTheWeek(int startDayOfTheMonth){
        //Find the day of Christmas when December 1 starts on startDayOfTheMonth
        int dayOfChristmas /* TODO */
        //Reduce this number so that is only between 0 & 6 inclusive.
        dayOfChristmas /* TODO */
        //Declare dayOfChristmasString and startDayOfTheMonthString, so they can be used later.
        /* TODO */
        //Switch statements make decisions. We will learn these in later units.
        switch(dayOfChristmas) {
            case 1:
                dayOfChristmasString = "Monday";
                break;
            case 2:
                dayOfChristmasString = "Tuesday";
                break;
            case 3:
                dayOfChristmasString = "Wednesday";
                break;
            case 4:
                dayOfChristmasString = "Thursday";
                break;
            case 5:
                dayOfChristmasString = "Friday";
                break;
            case 6:
                dayOfChristmasString = "Saturday";
                break;
            default:
                dayOfChristmasString = "Sunday";
        }
        //Switch statements make decisions. We will learn these in later units.
        switch(startDayOfTheMonth) {
            case 1:
                startDayOfTheMonthString = "Monday";
                break;
            case 2:
                startDayOfTheMonthString = "Tuesday";
                break;
            case 3:
                startDayOfTheMonthString = "Wednesday";
                break;
            case 4:
                startDayOfTheMonthString = "Thursday";
                break;
            case 5:
                startDayOfTheMonthString = "Friday";
                break;
            case 6:
                startDayOfTheMonthString = "Saturday";
                break;
            default:
                startDayOfTheMonthString = "Sunday";
        }
        return("Christmas is on " + dayOfChristmasString + " when December starts on a " + startDayOfTheMonthString + ".");
    }
    public static void main(String[] args)
    {
        System.out.println(Christmas.getDayOfTheWeek(6));
    }
}