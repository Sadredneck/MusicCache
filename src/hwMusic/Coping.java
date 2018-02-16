package hwMusic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
        File destFile = from.toFile();
        File[] cacheFiles = destFile.listFiles();
        if (cacheFiles == null) {
            System.out.println("AAAAA");
            return;
        }
        if (cacheFiles.length == 0) {
            System.out.println("No Cache");
            return;
        }
        for (File file : cacheFiles) {
            Path pathFrom = file.toPath();
            System.out.println(file);
            copyAndRename(pathFrom, dest);
        }
    }

    public static void copyAndRename(Path from, Path to) {
        try {
            Files.copy(from, Paths.get(to.toString() + from.getFileName() + ".mp3"));
        } catch (IOException e) {
        }
    }

}
