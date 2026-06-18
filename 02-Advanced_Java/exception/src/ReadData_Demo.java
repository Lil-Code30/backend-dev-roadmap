import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Demo {
    public static void main(String args[]){
        FileReader fr = null;

        try{
            File file = new File("file.txt");
            fr = new FileReader(file);
            char[] a = new char[50];
            fr.read(a); // read the content to the array

            for(char c : a)
                System.out.println(c); // print the characters one by one
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fr.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
