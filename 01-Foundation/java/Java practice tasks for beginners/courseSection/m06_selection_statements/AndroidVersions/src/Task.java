import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your android phone version: ");
        String version = sc.next();

        switch(version) {
            case "1.5":
                System.out.println("1.5 - Cupcake");
                break;
            case "1.6":
                System.out.println("1.6 - Donut");
                break;
            case "2.1":
                System.out.println("2.1 - Eclair");
                break;
            case "2.2":
                System.out.println("2.2 - Froyo");
                break;
            case "2.3":
                System.out.println("2.3 - Gingerbread");
                break;
            case "3.1":
                System.out.println("3.1 - Honeycomb");
                break;
            case "4.0":
                System.out.println("4.0 - Ice Cream Sandwich");
                break;
            case "4.1":
                System.out.println("4.1 - Jelly Bean");
                break;
            case "4.4":
                System.out.println("4.4 - KitKat");
                break;
            case "5.0":
                System.out.println("5.0 - Lollipop");
                break;
            case "8.0":
                System.out.println("8.0 - Oreo");
                break;
            case "9.0":
                System.out.println("9.0 - Pie");
                break;
            default:
                System.out.println("Not a valid version");
        }


    }
}