import java.io.File;

public class FileDemo {
    public static void main(String args[]){

        // Creating File in java
        /*
        -> Creating File in java
             - Using FileOutputStream() constructor
             - Using File.createNewFile() method
             - Using Files.write() method
        */

        String mainPath = "/Users/ismaelloko/Downloads/_workstation/Workstation/web-dev/Learning/Back-end-Developer-Path_boot.dev/02-Advanced_Java/IOSeries/src/test/";
        File f = null;

        String[] strs = {"test1.txt", "test2.txt"};

        try{
            // for each string in string array
            for(String s: strs){

                // create new file
                f = new File(s);

                boolean bool = f.canExecute();

                //find absolute path
                String a = f.getAbsolutePath();

                System.out.println("The absolute path is: "+a);

                System.out.println("this file is executable: " + bool);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
