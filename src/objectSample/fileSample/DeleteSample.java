package objectSample.fileSample;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

class DeleteSample {
    public static void main(String[] args) {
        Path copy = Paths.get("src","objectSample","fileSample","copy");

        //ファイル・ディレクトリのの削除
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#delete(java.nio.file.Path)
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#deleteIfExists(java.nio.file.Path)
        try {
            Files.delete(copy);
            //Files.deleteIfExists(copy);
        } catch (NoSuchFileException e) {
            System.out.println("削除するファイルが存在しない");
        } catch (DirectoryNotEmptyException e) {
            System.out.println("削除するディレクトリが空ではない");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}