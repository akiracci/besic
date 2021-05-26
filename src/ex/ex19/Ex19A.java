package ex.ex19;

import objectSample.exceptionSample.original.Gender;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
    Ex14のStudentクラスを再利用して処理を行う
    国数英の3科目の合計点の降順で生徒の情報を出力すること

    出力例
    こんどう 女 1 5 14 100 100 100 300
    うえの 男 1 2  4  90  90 100 280
    あきば 男 1 1  1  80  50  60 190

 */
class Ex19A {
    public static void main(String[] args) {
        //CSVの読み込み
        Path path = Paths.get("src","ex","ex19","student.csv");
        List<Student> studentList = new ArrayList<>();

        try(BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line = br.readLine();
            while (line != null) {
                //文字列の分割とStudentクラスのインスタンス作成
                String[] data = line.split(",",8);
                String name = data[0];
                Gender gender = "男".equals(data[1]) ? Gender.MEN:Gender.WOMEN;
                int grade = Integer.parseInt(data[2]);
                int cl = Integer.parseInt(data[3]);
                int no = Integer.parseInt(data[4]);
                int jap = Integer.parseInt(data[5]);
                int math = Integer.parseInt(data[6]);
                int eng = Integer.parseInt(data[7]);
                studentList.add(new Student(name,gender,grade,cl,no,jap,math,eng));

                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //ソートと表示
        studentList.sort(Comparator.comparing(Student::getSum,Comparator.reverseOrder()));
        for (Student s:studentList) System.out.println(s);

    }
}
