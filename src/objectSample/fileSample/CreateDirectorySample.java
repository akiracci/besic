package objectSample.fileSample;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class CreateDirectorySample {
    public static void main(String[] args) {
        Path newDir = Paths.get("src","objectSample","fileSample","newDir");

        //ディレクトリを作成する
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#createDirectory(java.nio.file.Path,java.nio.file.attribute.FileAttribute...)
        try {
            Files.createDirectory(newDir);
        } catch (UnsupportedOperationException e) {
            System.out.println("ディレクトリの作成時に原子的に設定できない属性が配列に含まれる");
        } catch (FileAlreadyExistsException e) {
            System.out.println("その名前のファイルがすでに存在するためにディレクトリを作成できなかった");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Path newDir2 = Paths.get("src","objectSample","fileSample","newDir2","newDir3");
        //階層化した複数のディレクトリーを作成する

        try {
            Files.createDirectories(newDir2);
        } catch (UnsupportedOperationException e) {
            System.out.println("ディレクトリの作成時に原子的に設定できない属性が配列に含まれる");
        } catch (FileAlreadyExistsException e) {
            System.out.println("その名前のファイルがすでに存在するためにディレクトリを作成できなかった");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
