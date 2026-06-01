public class Task {
    public static void main(String[] args) {

        sign(5);

    }

    public static void sign(int n){
        //Write your solution here

        if(n > 0){
            System.out.println("Positive.");
        }else if(n < 0){
            System.out.println("Negative.");
        }else{
            System.out.println("zero.");
        }
    }

}