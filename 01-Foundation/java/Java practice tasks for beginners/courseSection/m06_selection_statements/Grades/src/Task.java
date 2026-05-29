public class Task {
    public static void main(String[] args) {

        int testScore = 85;

        // ----Do not change below lines. needed for testing---
        testScore = args.length > 0 ? Integer.parseInt(args[0]) : testScore;
        //--------------------------------

        char grade;

        //Write your solution here

        if(testScore >= 90) {
            grade = 'A';
        } else if(testScore >= 80 && testScore < 90) {
            grade = 'B';
        } else if(testScore >= 70 && testScore < 80) {
            grade = 'C';
        }else if(testScore >= 60 && testScore < 70) {
            grade = 'D';
        }else{
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);

    }
}