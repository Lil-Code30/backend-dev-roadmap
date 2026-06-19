import java.io.File;

public class DirectoryTest {
    public static void main(String args[]){
        String dirname = "/Users/ismaelloko/Downloads/_workstation/Workstation/web-dev/Learning/Back-end-Developer-Path_boot.dev/02-Advanced_Java/IOSeries/src/test";
        File directory = new File(dirname);

        // create directory now
        directory.mkdirs();

        // create new file object
        File file = new File("/Users/ismaelloko/Downloads/_workstation/Workstation/web-dev/Learning/Back-end-Developer-Path_boot.dev/02-Advanced_Java/IOSeries/src/test");

        System.out.println(file.exists());
    }
}
