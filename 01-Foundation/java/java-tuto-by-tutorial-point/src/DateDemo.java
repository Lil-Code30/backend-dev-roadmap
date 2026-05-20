import java.util.*;
import java.text.*;

public class DateDemo {
    public static void main(String[] args){

        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        System.out.println(date.toString());

        // Date Formatting Using SimpleDateFormat
        Date dNow = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(dNow));

        // Date Formatting Using printf
        String str = String.format("Current Date/Time : %tc", date);

        System.out.println(str);

        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);

    }
}
