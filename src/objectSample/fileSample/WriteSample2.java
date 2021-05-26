package objectSample.fileSample;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//テキスト２３６P
class WriteSample2 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.addAll(Arrays.asList(
                "相澤凜,女,1996-08-22",
                "伊藤樹,男,2002-02-07",
                "上野詩,女,1984-04-15",
                "遠藤蓮,男,1974-11-27",
                "太田紬,女,1968-01-23"
        ));

        Path path = Paths.get("src", "objectSample", "fileSample", "output2.csv");
//https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html#newBufferedWriter(java.nio.file.Path,java.nio.charset.Charset,java.nio.file.OpenOption...)
        //newBufferedWriter 1行づつ書き込み
        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.CREATE)) {//StandardOpenOption.の定数の種類下に記載
            for (String line:data) {//一行分読み込んでbw.write(line);で１行づつlineに書き込み
                bw.write(line);//write：ライト　
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//APPEND
//ファイルがWRITE用に開かれた場合、バイトはファイルの先頭ではなく最後に書き込まれます。
//CREATE
//ファイルが存在しない場合は新しいファイルを作成します。
//CREATE_NEW
//新しいファイルを作成し、ファイルがすでに存在する場合は失敗します。
//DELETE_ON_CLOSE
//閉じるときに削除します。
//DSYNC
//ファイルの内容の更新は、基本となる記憶装置に同期的に書き込まれることを必要とします。
//READ
//読込みアクセス用に開きます。
//SPARSE
//スパース・ファイルです。
//SYNC
//ファイルの内容またはメタデータの更新は、基本となる記憶装置に同期的に書き込まれることを必要とします。
//TRUNCATE_EXISTING
//ファイルがすでに存在し、WRITEアクセス用に開かれた場合、その長さが0に切り詰められます。
//WRITE
//書込みアクセス用に開きます。