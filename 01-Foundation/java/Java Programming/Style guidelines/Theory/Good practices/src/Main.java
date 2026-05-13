import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        P p1 = new P(1, 2);
        System.out.printf(Locale.US, "Distance to origin is %.2f%n", p1.h());
        Point p2 = new Point(1, 2);
        System.out.printf(Locale.US, "Distance to origin is %.2f%n", p2.distanceOrigin());
    }
}