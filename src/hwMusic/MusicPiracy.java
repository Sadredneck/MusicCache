package hwMusic;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MusicPiracy {
    private static Path cachePath;
    static {
        switch (System.getProperty("os.name")) {
            case "Windows 7":
                cachePath = Paths.get(System.getProperty("user.home"));
                break;
        }
    }
}
