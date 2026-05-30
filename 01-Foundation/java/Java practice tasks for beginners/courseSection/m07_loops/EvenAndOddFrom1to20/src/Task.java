public class Task {
    public static void main(String[] args) {

        //Write your solution here

        for(int i = 1; i <= 20; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");

        for(int i = 1; i <= 20; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }

    }
}