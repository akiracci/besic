package objectSample.fileSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//テキストファイルの読み込みその２　テキスト235p
class ReadSample2 {
    public static void main(String[] args) {
        Path path = Paths.get("src","objectSample","fileSample","input.csv");

        try(BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line = br.readLine();
            //一行分読む　行がなくなればnullになる
            while (line != null) { //lineがnullになるまでくりかえし
                System.out.println(line);
                line = br.readLine();//lineに一行代入
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//static BufferedReader	newBufferedReader(Path path)
//ファイルを読込み用に開き、効率的な方法でファイルからテキストを読み込むBufferedReaderを返します。
//static BufferedReader	newBufferedReader(Path path, Charset cs)
//ファイルを読取り用に開き、そのファイルから効果的な方法でテキストを読み取るために使用できるBufferedReaderを返します。
//static BufferedWriter	newBufferedWriter(Path path, Charset cs, OpenOption... options)
//ファイルを書込み用に開くか作成して、そのファイルに効果的な方法でテキストを書き込むために使用できるBufferedWriterを返しま
