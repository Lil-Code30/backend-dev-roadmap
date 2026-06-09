
public class Task {
    public static void main(String[] args) {
        System.out.println(fixFormat("CADEN ARROYO"));
        System.out.println(fixFormat("jaX wOLF"));
    }

    public static String fixFormat(String name) {

        //Write your solution here
        String firstLetter = name.substring(0, 1).toUpperCase();
        String rest = name.substring(1).toLowerCase();

        return firstLetter + rest;

    }

}