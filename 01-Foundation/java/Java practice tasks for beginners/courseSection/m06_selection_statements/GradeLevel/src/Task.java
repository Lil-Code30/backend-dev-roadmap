import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Write your solution here
        System.out.print("How old are you? ");
        int age = sc.nextInt();

        if(age > 19){
            System.out.println("college");
        }else if (age > 14 && age <= 18){
            System.out.println("High School");
        }else if(age > 11 && age <= 13 ){
            System.out.println("Middle School");
        }else if (age > 6 && age <= 10){
            System.out.println("Elementary School");
        }else if (age == 5){
            System.out.println("Kindergarten");
        }else if (age >= 3 && age <= 4){
            System.out.println("Preschool");
        }else{
            System.out.println("Ineligible");
        }
    }
}