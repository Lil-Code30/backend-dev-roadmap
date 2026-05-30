public class Task {
    public static void main(String[] args) {

        //Write your solution here
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(char alphabet: alphabets.toCharArray()){
            System.out.print(alphabet);
        }

        System.out.println("\n");

        for(int i = alphabets.length() - 1; i >= 0; i--){
            System.out.print(alphabets.toLowerCase().charAt(i));
        }
    }
}