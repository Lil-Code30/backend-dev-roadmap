
public class Task {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome(1001));
    }

    public static boolean isPalindrome(String str) {

        //Write your solution here

        return true;
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;  // Negative numbers are not palindromes
        }

        int reversed = 0;
        int original = num;

       //Write your solution here

        return original == reversed;
    }

}