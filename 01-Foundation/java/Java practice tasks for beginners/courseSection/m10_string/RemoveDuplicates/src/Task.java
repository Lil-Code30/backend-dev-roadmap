
public class Task {
    public static void main(String[] args) {
        System.out.println(uniqueChars("java"));
        System.out.println(uniqueChars("mama"));
    }

    public static String uniqueChars(String str) {

        String unique = "";

        //Write your solution here
        for(int i = 0; i < str.length(); i++){
            if(!unique.contains(str.substring(i, i+1))){
                unique += str.charAt(i);
            }
        }

        return unique;
    }

}