public class Task {
    public static void main(String[] args) {

        System.out.println("The max is: " + max(1, 10));
        System.out.println("The max is: " + max(50, 10));

    }

    public static int max(int n, int n2){

        //Write your solution here

        // n > n2 ? n : n2;
        return Math.max(n, n2);
    }

}