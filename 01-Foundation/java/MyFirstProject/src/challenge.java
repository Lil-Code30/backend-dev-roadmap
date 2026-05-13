import java.util.Scanner;

public class challenge {
    /*
    * Quick Mini Challenge

        Try making a program that asks for:

        name
        age
        favorite programming language

        Then print everything nicely.
        * */

    public static void main(String[] args){

        // Quick Challenge

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.next();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("What id your favourite language? ");
        String favLang = scanner.next();

        System.out.println("Hello " + name + ", you are " + age + " years old and you favourite programming language is: " + favLang);

    }
}
