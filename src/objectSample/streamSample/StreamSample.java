package objectSample.streamSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Strieamの基本
//配列・Arraylist・コレクションを簡単に記述して処理する
//
public class StreamSample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("a","b","c"));

        stringList.stream()// strireamの作成
                .forEach(System.out::println);
    }
}
