package objectSample.streamSample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;


//テキスト１５７ｐ コレクションからStreamへの変換
public class streamSample3 {
    public static void main(String[] args) {
        //List→Stream
        //書き方は同じ
        List<String> stringList = List.of("Bob","Tom","Jack");
        stringList.stream().forEach(System.out::println);
        System.out.println("List→Stream");
        Set<String> stringSet = Set.of("Bob","Tom","Jack");
        stringSet.stream().forEach(System.out::println);


    //配列→Stream
        System.out.println("配列→Stream");
        String[] stringArray = {"Bob","Tom","Jack"};
        Arrays.stream(stringArray).forEach(System.out::println);


        //Map→Stream
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("Bob","ボブ");
        stringMap.put("Tom","トム");
        stringMap.put("Jack","ジャック");

        System.out.println("Map→Stream(entrySet)");
        stringMap.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

        System.out.println("Map→Stream(keySet)");
        stringMap.keySet().stream()
                .forEach(System.out::println);

        System.out.println("Map→Stream(values)");
        stringMap.values().stream()
                .forEach(System.out::println);


        //数値範囲
        IntStream intStream1 = IntStream.range(1,10);//1-9
        System.out.println("IntStream.range(1,10)");
        intStream1.forEach(System.out::println);

        IntStream  intStream2 = IntStream.rangeClosed(1,10);//1-10
        System.out.println("IntStream.rangeClosed(1, 10)");
        intStream2.forEach(System.out::println);

    }
}
