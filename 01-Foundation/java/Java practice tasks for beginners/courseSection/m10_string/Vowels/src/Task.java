public class Task {
    public static void main(String[] args) {

        String word = "apple";

        // ----Do not change below lines. needed for testing---
        word = args.length > 0 ? args[0] : word;
        //--------------------------------

        String vowels = "aeiou";
        for(int i = 0; i < word.length(); i++){
            String eachChar = word.substring(i, i+1);
            if(vowels.contains(eachChar)){
                System.out.print(eachChar);
            }
        }
    }
}
