import java.io.IOException;
import java.nio.file.*;

public class Replacement {
    public static void main(String[] args) throws IOException {

        // Get paths for input and target files.
        FileSystem system = FileSystems.getDefault();
        Path original = system.getPath("c:\\ITT786\\source.txt");
        Path target = system.getPath("c:\\ITT786\\output.bin");

        
        Files.copy(original, target, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Done!");
    }
}
