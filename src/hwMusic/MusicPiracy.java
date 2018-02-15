package hwMusic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MusicPiracy {
    private static Path cachePath;

    static {
        switch (System.getProperty("os.name")) {
            case "Windows 10":
            case "Windows 8":
            case "Windows 7":
                cachePath = Paths.get(System.getProperty("user.home"), "AppData", "Google", "Chrome", "User Data", "Default", "Media Cache");
                System.out.println("wiwda");
                break;
            case "Mac OS X":
                cachePath = Paths.get(System.getProperty("user.home"), "Caches", "Google", "Chrome", "Default", "Media Cache");
                System.out.println("maca");
                break;
            default:
                cachePath = Paths.get(System.getProperty("user.home"), "AppData", "Google", "Chrome", "User Data", "Default", "Media Cache");
                System.out.println("wiwda");
                break;
        }
    }

    public static Path getCachePath() {
        return cachePath;
    }
}
