public class Tester {

    public static void main(String[] args){

        int num1 = 5004;
        double num2 = 2.5;
        double sum = num1 + num2;

        // implicit type casting
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        // explicit type casting
        // syntax : double doubleNum = (double) num;
        System.out.println();

        int num = 5004;
        //type casting int to double
        double doubleNum = (double) num;

        System.out.println("The value of " + num + " after converting to the double is " + doubleNum);

        // type casting double to int
        int convertedInt = (int) doubleNum;

        System.out.println("The value of " + doubleNum + " after converting to the int again is " + convertedInt);

    }
}
