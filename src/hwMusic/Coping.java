package hwMusic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Coping {
    private ArrayList<Path> paths;

    public ArrayList<Path> getPaths() {
        return paths;
    }

    public void createFolder(String folder) {
        try {
            Files.createDirectories(Paths.get(folder));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
