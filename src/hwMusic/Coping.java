package hwMusic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Coping {

    public static Path createFolder(String folder) {
        try {
            File directory = new File(folder);
            directory.mkdir();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return Paths.get(folder);
        }
    }

    public static void iterateFiles(Path from, Path dest) {
        File[] cacheFiles = from.toFile().listFiles();
        if (cacheFiles == null) {
            System.out.println("No Cache Folder");
            return;
        }
        if (cacheFiles.length == 0) {
            System.out.println("No Cache");
            return;
        }
        for (File file : cacheFiles) {
            Path pathFrom = file.toPath();
            if (file.length() == 1048576)
                copyAndRename(pathFrom, dest);
        }
    }

    public static void copyAndRename(Path from, Path to) {
        try {
            Files.copy(from, Paths.get(to.toString(), from.getFileName() + ".mp3"),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
        }
    }

}
