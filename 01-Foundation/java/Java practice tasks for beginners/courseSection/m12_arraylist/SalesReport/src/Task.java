import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(List.of(300000.0, 200000.0, 250000.0, 250000.0));
        System.out.println(calculateSales(list));

        list = new ArrayList<>(List.of(300000.0, 200000.0, 250000.0, 1000000.0, 15000000.0));
        System.out.println(calculateSales(list));

        list = new ArrayList<>(List.of(3000000.0, 5000.0, 250000.0, 1000000.0, 3500000.0));
        System.out.println(calculateSales(list));

    }

    public static boolean calculateSales(ArrayList<Double> sales) {

        //Write your solution here

    }

}