package modernScenario;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FilesReadWrite {
    public static void main(String args[]){
        String dirname = "/Users/ismaelloko/Downloads/_workstation/Workstation/web-dev/Learning/Back-end-Developer-Path_boot.dev/02-Advanced_Java/IOSeries/src/test";

        try{
            Path path = Path.of(dirname + "/test.txt");
            Path source = Path.of(dirname + "/source.txt");
            Path target = Path.of(dirname + "/target.txt");

            System.out.println("The absolute path is: "+path.toAbsolutePath());

            // --- WRITING ---
            // Java 11+
            Files.writeString(path, "Hello NIO!\n Second line.");

            // Java 7+
            List<String> lines = List.of("Hello NIO2!", "Second line2.");
            Files.write(path, lines);

            // --- READING ---
            // java 11+
            String content = Files.readString(path);
            System.out.println(content);

            System.out.println("==================");

            //java 7+
            List<String> readLines = Files.readAllLines(path);
            System.out.println(readLines);

            // =============
            // File sys operation (copy, move, delete)
            // to copy -> (REPLACE_EXISTING overwrites if target exists)
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

            // to move -> (ATOMIC_MOVE) move the file as an atomic file system operation
            Files.move(source, Path.of(dirname + "/final.txt"),  StandardCopyOption.ATOMIC_MOVE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
