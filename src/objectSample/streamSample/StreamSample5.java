package objectSample.streamSample;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.function.Function;

public class StreamSample5 {
    public static void main(String[] args) {
        List<Data> dataList = List.of(
                new Data("1","Tom"),
                new Data("2","Bob"),
                new Data("3","Jack")
        );
        Path csv= Paths.get("src","objectSample","streamSample","data2.csv");

        Function<Data,String> toCsv = d -> String.join(",",d.getId(),d.getName());
        try(BufferedWriter bw = Files.newBufferedWriter(csv, StandardOpenOption.CREATE)){
            dataList.stream()
                    .map(toCsv)
                    .forEach(s -> {
                        try {
                            bw.write(s);
                            bw.newLine();
                        } catch (IOException e){
                            e.printStackTrace();
                        }
            });
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
