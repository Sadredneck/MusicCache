import hwMusic.Coping;
import hwMusic.MusicPiracy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the destination folder: ");
        String dest = reader.readLine();
        MusicPiracy.doPiracy(Coping.createFolder(dest));
        System.out.println("Copying has been made");

    }
}
