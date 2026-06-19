import java.io.File;

public class DirectoryTest1 {
    public static void main(String args[]){
        String dirname = "/Users/ismaelloko/Downloads/_workstation/Workstation/web-dev/Learning/Back-end-Developer-Path_boot.dev/02-Advanced_Java/IOSeries/src/test";
        File file = null;
        String[] paths;

        try{
            int count = 0;
            file = new File("/tmp");

            // array of files and directory
            paths = file.list();

            System.out.println(paths.length + " elements found");
            System.out.println("++++++++++++++++++++++++++");

            // for each name in the path array
            for(String path: paths){
                count++;
                // print filename and directory name
                System.out.println(count + " - " + path);
            }
        }catch(Exception e){

            e.printStackTrace();
        }
    }
}
