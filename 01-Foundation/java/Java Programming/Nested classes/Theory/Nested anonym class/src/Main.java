import java.io.File;
import java.io.FilenameFilter;

public class Main {
   // List all the files of the repository D:\\Data having the extension .java
   public static void main(String[] args) {
      String path = System.getProperty("user.dir") +
            "\\Nested classes\\Theory\\Nested anonym class\\src";
      File f = new File(path); // The directory to enumerate

      // The list() method take in argument an object of type/interface
      // FilenameFilter.
      // An instance of an anonymous class implementing FilenameFilter is
      // directly created as argument.
      String[] fileList1 = f.list(new FilenameFilter() {
         public boolean accept(File dir, String s) {
            return s.endsWith(".java");
         }
      }); // Don't forget end parenthesis and semicolon

      // Display the list of files
      if (fileList1 != null) {
         for (int i = 0; i < fileList1.length; i++) {
            System.out.println("File name : " + fileList1[i]);
         }
      }

      // Same example using an anonymous class implementing an abstract class
      // An instance of an anonymous class extending MyFilter is
      // directly created as argument.
      String[] fileList2 = f.list(new MyFilter() {
         public boolean accept(File dir, String s) {
            return s.endsWith(".java");
         }
      }); // Don't forget end parenthesis and semicolon

      // Display the list of files
      if (fileList2 != null) {
         for (int i = 0; i < fileList2.length; i++) {
            System.out.println("File name : " + fileList2[i]);
         }
      }
   }
}
