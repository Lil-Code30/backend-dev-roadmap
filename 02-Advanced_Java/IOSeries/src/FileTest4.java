import java.io.File;
import java.io.IOException;

public class FileTest4 {
    public static void deleteFiles(File dirPath){
        // put all the files+directory in an array
        File filesList[] = dirPath.listFiles();

        int count = 0;

        for(File file : filesList){

            // check if the current file is a File
            if(file.isFile()){
                count++;
                file.delete();
            }else{
                // recall the function on the else since is it a directory
                deleteFiles(file);
            }
        }

        System.out.println("Deleted "+count+" files");
    }

    public static void main(String args[]){
        String mainPath = "/Users/ismaelloko/Downloads/_workstation/Workstation/web-dev/Learning/Back-end-Developer-Path_boot.dev/02-Advanced_Java/IOSeries/src/test/";

        // creating a File object for directory
        File file = new File(mainPath );

        // List of all the files and directories
        deleteFiles(file);
        System.out.println("Files deleted");
    }
}
