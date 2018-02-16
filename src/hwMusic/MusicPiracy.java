package hwMusic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MusicPiracy {
    private static Path cachePath;

    static {
        switch (System.getProperty("os.name")) {
            case "Mac OS X":
                cachePath = Paths.get(System.getProperty("user.home"), "Library", "Caches", "Google", "Chrome", "Default", "Media Cache");
                System.out.println("maca");
                break;
            case "Windows 10":
            case "Windows 8":
            case "Windows 7":
                default:
                cachePath = Paths.get(System.getProperty("user.home"), "AppData", "local", "Google", "Chrome", "User Data", "Default", "Media Cache");
                System.out.println("wiwda");
                break;
        }
    }

    public static void doPiracy(Path destination) {
        Coping.iterateFiles(cachePath, destination);
    }

    public static Path getCachePath() {
        return cachePath;
    }
}
