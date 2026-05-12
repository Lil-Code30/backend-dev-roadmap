public class Java {
    public static void main(String[] args){
        //  Declaring Variables in Java

        int a;
        int b;
        double c;

        a = 10;
        b = 20;
        c = a + b;

        System.out.println( a + " + " + b + " = " + c);

        String name = "Baeldung";
        char toggle = 'y';
        boolean isVerified = true;

        // Arrays

        int[] numbers = new int[100];

        numbers[0] = 3;
        numbers[1] = 4;
        numbers[2] = 300;

        int theThirdNumber = numbers[2];

        System.out.println("The Third number is " + theThirdNumber);
        System.out.println("The length of the array is " + numbers.length);

        // Logical operation
        int number = 6;

        if(( number % 2 == 0) && (number % 3 == 0)){
            System.out.println("The number is both divisible by 2 and 3");
        }

        // voting
        int age = 16;
        if(canVote(age)){
            System.out.println("Yes, You can vote :)");
        }else{
            System.out.println(":( sorry you cannot vote at this age.");
        }
    }

    public static boolean canVote(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}
