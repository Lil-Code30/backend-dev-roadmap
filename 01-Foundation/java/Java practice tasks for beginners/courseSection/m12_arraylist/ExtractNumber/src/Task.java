
public class Task {
    public static void main(String[] args) {
        System.out.println(extractNum("aa2aa3"));
    }

    public static String extractNum(String str) {

        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {  // Check if the character is a digit
                result.append(ch);  // Append the digit to the result
            }
        }
        return result.toString();  // Convert StringBuilder to String and return

    }

}