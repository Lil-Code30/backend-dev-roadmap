import java.io.*;

public class Main {

   public static void main(String[] args) {

      // Search the current directory
      File file = new File(".", "IO");
      file = new File(file, "Theory");
      file = new File(file, "Stream");

      // Append the files names, aka input.txt and output.txt
      String inputPath = new File(file, "input.txt").toString();
      String outputPath = new File(file, "output.txt").toString();

      // Open the input and output file using try-with-resources
      try (BufferedReader inputS = new BufferedReader(new FileReader(inputPath));
           BufferedWriter outputS = new BufferedWriter(new FileWriter(outputPath))) {
         // Read from input.txt and write line by line to output.txt
         String line;
         while ((line = inputS.readLine()) != null) {
            outputS.write(line);
            outputS.write("\r\n");
         }
      } catch (IOException e) {
         System.out.println(e.getMessage());
      }
   }
}
