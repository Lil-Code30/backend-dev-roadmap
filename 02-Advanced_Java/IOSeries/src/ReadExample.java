import java.io.*;

public class ReadExample {
    public static void main(String args[]){
        String dirname = "/Users/ismaelloko/Downloads/_workstation/Workstation/web-dev/Learning/Back-end-Developer-Path_boot.dev/02-Advanced_Java/IOSeries/src/test";

        try{
            BufferedReader br = new BufferedReader(new FileReader(dirname + "/test.txt"));
            String line;

            // The 'true' parameter in FileWriter enables "append"
            BufferedWriter bw = new BufferedWriter(new FileWriter(dirname + "/test2.txt", true));

            bw.write("Hello world");
            bw.newLine(); // writes a line break
            bw.write(" This is a buffered write,");

            // readLine() return null when end of the file is reached
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
