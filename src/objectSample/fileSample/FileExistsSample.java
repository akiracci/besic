package objectSample.fileSample;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExistsSample {
    public static void main(String[] args) {
        Path existsFile = Paths.get("src","objectSample","fileSample","base.txt");
        Path notexistsFile = Paths.get("src","objectSample","fileSample","copy.txt");

        System.out.println(Files.exists(existsFile));
        System.out.println(Files.exists(notexistsFile));


        System.out.println(Files.notExists(existsFile));
        System.out.println(Files.notExists(notexistsFile));
    }
}
