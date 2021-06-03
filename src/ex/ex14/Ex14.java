package ex.ex14;

import objectSample.exceptionSample.original.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Ex14 {
    public static void main(String[] args) {
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

        //一覧表示
        for(Student s:list) {
            System.out.println(s);
        }

        //クラスごとの平均
        Map<Integer,List<Student>> studentMap = new TreeMap<>();

        //分類
        for(Student s:list) {
            if(studentMap.containsKey(s.getCl())) {
                //すでにクラスが存在する
                List<Student> classList = studentMap.get(s.getCl());//クラスのリストを取得
                classList.add(s);//学生の追加
                studentMap.put(s.getCl(),classList);//マップの再設定
            } else {
                List<Student> classList = new ArrayList<>();//クラスリストの新規作成
                classList.add(s);//そのクラスの一人目を追加
                studentMap.put(s.getCl(),classList);//マップへ初回追加
            }
        }
        //System.out.println(studentMap);

        //集計
        System.out.println("\nクラスごとの集計");
        for (int i = 1; i < 6; i++) {
            List<Student> classList = studentMap.get(i);
            int sumjap = 0,sumMath = 0,sumEng = 0;
            for (Student s:classList) {
                sumjap += s.getJap();
                sumMath += s.getMath();
                sumEng += s.getEng();
            }
            double aveJap = (double) sumjap / classList.size();
            double aveMath = (double) sumMath / classList.size();
            double aveEng = (double) sumEng / classList.size();

            System.out.println(String.format("1-%d %.2f %.2f %.2f", i, aveJap, aveMath, aveEng));

        }
    }
}
