package hwMusic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    public static void iterateFiles(Path folder, Path dest) {
        if (folder.toFile().listFiles().length==0) {
            System.out.println("No Cache");
            return;
        }
        for (File file : folder.toFile().listFiles()) {
            Path pathFrom = file.toPath();
            copyAndRename(pathFrom, dest);
        }
    }

    public static void copyAndRename(Path path, Path dest) {

    }
}
