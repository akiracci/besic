package objectSample.fileSample;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


//テキストファイルの読み込みその１
class ReadSample1 {
    public static void main(String[] args) {
        Path path = Paths.get("src","objectSample","fileSample","input.csv");

        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (String line:lines) System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//[static List<String>]	readAllLines(Path path)　ファイルからすべての行を読み取ります。
//[static List<String>]	readAllLines(Path path, Charset cs)　ファイルからすべての行を読み取ります。

//大きなファイルは読み取れない
//一度に読み込むタイプ