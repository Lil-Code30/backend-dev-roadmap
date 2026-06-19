import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileTest1 {
    public static void main(String args[]){

        //FileOutputStream is used to create a file and write data into it.
        // The stream would create a file, if it doesn't already exist,
        // before opening it for output.

        try{
            byte bwrite[] = {65, 66, 67, 68, 69};

            OutputStream os = new FileOutputStream("test.txt");

            for(int x = 0; x < bwrite.length; x++){
                // writes the bytes
                os.write(bwrite[x]);
            }

            os.close();

            InputStream is = new FileInputStream("test.txt");

            int size = is.available();

            for(int i = 0; i < size; i++){
                System.out.println((char)is.read());
            }

            is.close();

        } catch (IOException e){
            System.out.println("IOException" + e.getMessage());
        }
    }
}
