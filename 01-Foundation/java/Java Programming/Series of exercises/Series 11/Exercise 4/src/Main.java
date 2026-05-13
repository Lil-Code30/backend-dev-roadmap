import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filenameIn= "./Series of exercises/Series 11/Exercise 4/src/codeWithVigenere.txt";
        String key="JAVA";
        if (args.length==0) {
            System.out.println("No parameter given... Trying with "+filenameIn+" "+key);
        } else if (args.length == 2) {
            filenameIn = args[0];
            key = args[1];
        } else {
            System.out.println("Error: two arguments expected, "
                    + "i.e. filename and uppercase cipher key word.");
            return;
        }
        String filenameOut = filenameIn.substring(0,filenameIn.length() - 4);
        boolean decode;
        if (filenameIn.endsWith(".vig")) {
            filenameOut += ".txt";
            decode = true;
        } else if (filenameIn.endsWith(".txt")) {
            filenameOut += ".vig";
            decode = false;
        } else {
            System.out.println("ERROR: filename should end with '.txt' or '.vig'");
            return;
        }
        /* Implement the program based on instructions */
    }


    //----------------------------------------------------------------------------
    // Encrypts/decrypts input using Vigenere's cipher algorithm with given key
    //----------------------------------------------------------------------------
    public static void vigenereCypher(BufferedReader in,
                                      PrintWriter out,
                                      String key,
                                      boolean decode) throws IOException {
        /* Implement the program based on instructions */
    }
}