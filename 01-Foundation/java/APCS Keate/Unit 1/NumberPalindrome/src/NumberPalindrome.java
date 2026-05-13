/**
 * NumberPalindrome.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class NumberPalindrome {
    /** Prints out whether number is a palindrome.
     * Preconditions: number is three digits long and does not have a 0 as its last digit.
    */
    public static String isPalindrome3Digits(int number){
            boolean pally = false;
            int num = number;
            int reverse = 0;
            //Isolate the last digit of number.
            /* TODO */
            //Update reverse so that the last digit of num is now first.
            reverse /* TODO */
            //Update num so that it no longer includes the last digit of number.
            num /* TODO */
            //Isolate the new last digit of num.
            /* TODO */
            //Update reverse so that the last digit of num is now last.
            reverse /* TODO */
            //Update num so that it no longer includes its last digit.
            num /* TODO */
            //Isolate the new last digit of num.
            /* TODO */
            //Update reverse so that the last digit of num is now last.
            reverse /* TODO */
            if(number == reverse)
                pally = true;
            return("It is " + pally + " " + number + " is a palindrome.");
        }
    /** Prints out whether number is a palindrome.
     * Preconditions: number is four digits long and does not have a 0 as its last digit.
     */
    public static String isPalindrome4Digits(int number){
        boolean pally = false;
        int num = number;
        int reverse = 0;
        //Repeat the calculations above but modify them to account for one more digit.
        /* TODO */
        if(number == reverse)
            pally = true;
        //The statement returned should be the same format as the statement returned in isPalindrome4Digits
        return(/* TODO */);
    }
        public static void main(String[] args)
        {

            System.out.println(NumberPalindrome.isPalindrome3Digits(121));
            System.out.println(NumberPalindrome.isPalindrome3Digits(122));
            System.out.println(NumberPalindrome.isPalindrome4Digits(1221));
            System.out.println(NumberPalindrome.isPalindrome4Digits(1213));
        }
}