package ex.ex23;

import objectSample.exceptionSample.original.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex23 {


    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Student("あきば", Gender.MEN, 1, 1, 1, 80, 50, 60),
                new Student("いしはら", Gender.WOMEN, 1, 1, 2, 70, 60, 80),
                new Student("うえの", Gender.MEN, 1, 2, 4, 90, 90, 100),
                new Student("えんどう", Gender.WOMEN, 1, 2, 5, 60, 40, 20),
                new Student("おおた", Gender.MEN, 1, 3, 6, 40, 30, 25),
                new Student("かきざき", Gender.WOMEN, 1, 3, 7, 60, 60, 60),
                new Student("きむら", Gender.MEN, 1, 4, 9, 85, 50, 90),
                new Student("くどう", Gender.WOMEN, 1, 4, 11, 100, 75, 85),
                new Student("けんざき", Gender.MEN, 1, 5, 12, 75, 60, 30),
                new Student("こんどう", Gender.WOMEN, 1, 5, 14, 100, 100, 100)
        ));

        //一覧表示

        //1行づつ表示して繰り返し（for文と同じ処理）
        //stringList.stream()// strireamの作成
        //        .forEach(System.out::println);

        list.stream()
                .forEach(System.out::println);

        //クラス平均を求める為のクラス分けする
        //Map<String,List<Student>> group = studentList.stream()
        //                .collect(Collectors.groupingBy(Student::getGroup));
       Map<Integer,List<Student>> cl = list.stream()
                .collect(Collectors.groupingBy(Student::getCl));
        System.out.println("クラス分け");//確認用
        cl.entrySet().stream()
                .map(e -> e.getKey() + ":" + e.getValue().toString())
                .forEach(System.out::println);


        //グループごとの合計
        Map<Integer,Long> sum = list.stream()
                .collect(Collectors.groupingBy(ex.ex23.Student::getCl,Collectors.summingLong(ex.ex23.Student::getSum)));
        System.out.println("グループごとの合計");
        sum.entrySet().stream()
                .map(e -> e.getKey() + ":"+ e.getValue())
                .forEach(System.out::println);
        //クラスごとの平均
        //Map<Integer,Student> studentMap = new TreeMap<>();

        //平均を求める
        //        OptionalDouble ave = integerList.stream()
        //                .mapToDouble(i -> (double) i)
        //                .average();
        //グループごとの平均
        Map<Integer,Double> average = list.stream()
                .collect(Collectors.groupingBy(ex.ex23.Student::getCl,Collectors.averagingDouble(ex.ex23.Student::getSum)));

        System.out.println("グループごとの平均");
        average.entrySet().stream()
                .map(e -> e.getKey() + ":"+ String.format("%.2f",e.getValue()))
                .forEach(System.out::println);

    }
}
