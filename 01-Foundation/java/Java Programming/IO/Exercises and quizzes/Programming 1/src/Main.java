import java.io.*;

public class Main {

   public static void main(String[] args) {
      // Search the current directory
      File file = new File(".", "IO");
      file = new File(file, "Exercises_and_quizzes");
      file = new File(file, "Programming_1");

      // Append the files names, aka input.txt and output.txt
      String inputPath = new File(file, "input.txt").toString();
      String outputPath = new File(file, "output.txt").toString();

      // Open the input and output file using try-with-resources
      try (/* Open the files using try-with-resources */) {

         int c;
         // We simply, blindly copy each byte from the input file to the
         // output file
         while (/* While the read() doesn't return -1, a byte is available */) {
            out.write(c);
         }
      } /* Catch the necessary placeholder */
      System.out.println("Check the output.txt file and it's meaning !");
   }
}
