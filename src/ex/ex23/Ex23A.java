package ex.ex23;

import objectSample.exceptionSample.original.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Ex23A {
    public static void main(String[] args) {
        //Ex14の処理をStreamを使って処理しなさい
        List<Student> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Student("あきば", Gender.MEN,1,1,1,80,50,60),
                new Student("いしはら", Gender.WOMEN,1,1,2,70,60,80),
                new Student("うえの",Gender.MEN,1,2,4,90,90,100),
                new Student("えんどう",Gender.WOMEN,1,2,5,60,40,20),
                new Student("おおた",Gender.MEN,1,3,6,40,30,25),
                new Student("かきざき",Gender.WOMEN,1,3,7,60,60,60),
                new Student("きむら",Gender.MEN,1,4,9,85,50,90),
                new Student("くどう",Gender.WOMEN,1,4,11,100,75,85),
                new Student("けんざき",Gender.MEN,1,5,12,75,60,30),
                new Student("こんどう",Gender.WOMEN,1,5,14,100,100,100)
        ));

        System.out.println("一覧表示");
        list.forEach(System.out::println);

        //分類
        Map<Integer,List<Student>> studentMap = list.stream()
                .collect(Collectors.groupingBy(Student::getCl));

        System.out.println("グループ分け");
        studentMap.entrySet().stream()
                .map(e -> e.getKey() + ":" + e.getValue().toString())
                .forEach(System.out::println);


        System.out.println("クラスごとの平均");
        studentMap.entrySet().stream()
                .map(e -> {
                    Integer cl = e.getKey();
                    List<Student> studentList = e.getValue();
                    OptionalDouble aveJap = studentList.stream().mapToDouble(Student::getJap).average();
                    OptionalDouble aveMath = studentList.stream().mapToDouble(Student::getMath).average();
                    OptionalDouble aveEng = studentList.stream().mapToDouble(Student::getEng).average();
                    return String.format("1-%d %.2f %.2f %.2f",
                            cl,aveJap.orElse(0),aveMath.orElse(0) , aveEng.orElse(0));
                })
                .forEach(System.out::println);
    }
}