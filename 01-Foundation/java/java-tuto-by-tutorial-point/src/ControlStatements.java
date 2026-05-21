public class ControlStatements {

    public static void main(String[] args){
        int a = 10;

        int b = (a == 1) ? 20 : 30;

        System.out.println("The value of b is " + b);

        b = (a == 10) ? 20 : 30;

        System.out.println("The value of b is " + b);

        // if...else && nested if
        int x = 10, y = 20, z = 30;

        if(x >= y){
            if( x >= z){
                System.out.println("x is the greatest");
            }else{
                System.out.println("z is the largest");
            }
        }else{
            if(y >= z){
                System.out.println("y is the greatest");
            }else{
                System.out.println("z is the largest");
            }
        }

        // switch case

        char grade = 'C';

        switch(grade){

            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'E':
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Your grade is not found in the system");
        }

        System.out.println("Your grade is " + grade);
    }
}
