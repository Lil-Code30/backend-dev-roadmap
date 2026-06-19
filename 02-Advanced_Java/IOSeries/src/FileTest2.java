import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest2 {
    public static void main(String args[]){
        // File.createNewFile() method allows to create a file in given location
        // or in current directory

        String mainPath = "/Users/ismaelloko/Downloads/_workstation/Workstation/web-dev/Learning/Back-end-Developer-Path_boot.dev/02-Advanced_Java/IOSeries/src/test/";

        try{
            File file = new File(mainPath + "test1.txt");

            // Create the file
            if(file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists!");
            }

            // write content
            FileWriter writer = new FileWriter(file);
            writer.write("Test data");
            writer.close();

            // read content
            FileReader reader = new FileReader(file);

            int c;

            while((c = reader.read()) != -1){
                System.out.print((char)c);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
