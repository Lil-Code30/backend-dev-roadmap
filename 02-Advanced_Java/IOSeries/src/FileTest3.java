import java.io.File;
import java.io.IOException;

public class FileTest3 {

    public static void main(String[] args){
        File file = new File("test.txt");
        boolean success = file.delete();

        if(success){
            System.out.println("The file has been successfully deleted.");
        }else{
            System.out.println("The file deletion failed.");
        }
    }
}
