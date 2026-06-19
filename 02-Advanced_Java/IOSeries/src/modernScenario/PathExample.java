package modernScenario;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String args[]){

        // java 11+ wat (Recommended)
        Path modernPath = Path.of("documents", "report.txt");

        // java 7/8 way
        Path legacyPath = Paths.get("documents", "report.txt");

        // Useful Path methods:
        System.out.println(modernPath.getFileName());       // report.txt
        System.out.println(modernPath.getParent());         // documents
        System.out.println(modernPath.toAbsolutePath());    // /absolute/path/to/documents/report.txt

        // Resolving paths (joining them)
        Path dir = Path.of("C:/data");
        Path file = dir.resolve("users.csv"); // C:/data/users.csv

        System.out.println(file.toAbsolutePath());
    }
}
