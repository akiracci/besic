package objectSample.streamSample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamSample4 {
    public static void main(String[] args) {
        Path csv = Paths.get("src","objectSample","streamSample","data.csv");
        List<Data> dataList = new ArrayList<>();
        Function<String,Data> toData = s -> {
            String[] column = s.split(",",2);
            return new Data(column[0],column[1]);
        };

        try (Stream<String> lines = Files.lines(csv)) {
            dataList = lines
                    .map(toData)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        dataList.forEach(System.out::println);
    }
}

