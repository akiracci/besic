package ex.ex20;

import objectSample.exceptionSample.original.Gender;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Ex20A {
    /*
        student.csvを読み込み加工してstudent2.csvとして出力する

        student2.csvは三科目の合計点が高いものから出力され、個人合計と個人平均が追加される。

        出力例
        こんどう,女,1,5,14,100,100,100,300,100.0
        うえの,男,1,2,4,90,90,100,280,93.3
        あきば,男,1,1,1,80,50,60,190,63.3
     */
    public static void main(String[] args) {
        //CSV読み込みとStudentクラスのインスタンス変換
        Path input = Paths.get("src","ex","ex20","student.csv");
        List<Student> studentList = new ArrayList<>();

        try(BufferedReader br = Files.newBufferedReader(input, StandardCharsets.UTF_8)) {
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

        //ソートとCSV書き込み
        studentList.sort(Comparator.comparing(Student::getSum,Comparator.reverseOrder()));

        Path output = Paths.get("src","ex","ex20","student2.csv");
        try (BufferedWriter bw = Files.newBufferedWriter(output, StandardCharsets.UTF_8, StandardOpenOption.CREATE)) {
            for (Student s:studentList) {
                bw.write(s.toCsv());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
