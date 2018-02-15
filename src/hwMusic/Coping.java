package hwMusic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Coping {
    //private ArrayList<Path> paths;
    private Path destination;
    private Path fromCache;

    public void createFolder(String folder) {
        try {
            Files.createDirectories(Paths.get(folder));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            setDestination(Paths.get(folder));
        }
    }

    public void setDestination(Path destination) {
        this.destination = destination;
    }

    public void setFromCache(Path fromCache) {
        this.fromCache = fromCache;
    }

    public void iterateFiles(File folder) {
        for (File file : folder.listFiles()) {
            Path pathFrom = file.toPath();

        }
    }

    public Coping(Path destination, Path fromCache) {
        this.destination = destination;
        this.fromCache = fromCache;
    }

    public boolean checkExist(Path path){
        return false;
    }

    public void copyAndRename(Path path) {
        
    }
}
