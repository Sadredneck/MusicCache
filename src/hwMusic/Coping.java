package hwMusic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Coping {

    public static Path createFolder(String folder) {
        try {
            Files.createDirectories(Paths.get(folder));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return Paths.get(folder);
        }
    }

    public static void iterateFiles(File folder) {
        if (folder.listFiles().length==0) {
            System.out.println("No Cache");
            return;
        }
        for (File file : folder.listFiles()) {
            Path pathFrom = file.toPath();
            copyAndRename(pathFrom);
        }
    }

    public static void copyAndRename(Path path) {

    }
}
