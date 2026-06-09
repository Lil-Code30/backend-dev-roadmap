
public class Task {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi how"));
        System.out.println(countHi("hihi bye"));
        System.out.println(countHi("hihi bye hihihihi"));
    }

    public static int countHi(String str) {

        //Write your solution here
        int count = 0;

        for(int i=0; i < str.length(); i++){

            // str.substring(i, i+1).equals("h") && str.substring(i+1, i+2).equals("i")
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
                count++;
            }
        }

        return count;

    }

}