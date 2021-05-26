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
class Ex19 {
    public static void main(String[] args) {
//List<Person> personList = new ArrayList<>();
//        personList.addAll(Arrays.asList(
//                new Person("相澤凜", Gender.WOMEN, LocalDate.parse("1996-08-22")),
//                new Person("伊藤樹",Gender.MEN,LocalDate.parse("2002-02-07")),
//                new Person("上野詩",Gender.WOMEN,LocalDate.parse("1984-04-15")),
//                new Person("遠藤蓮",Gender.MEN,LocalDate.parse("1974-11-27")),
//                new Person("太田紬",Gender.WOMEN,LocalDate.parse("1968-01-23"))
//        ));
        Path path = Paths.get("src","ex","ex19","Student.csv");
        List<Student> studentList =new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
            String line = br.readLine();//ファイルから１行読み込み
            while (line != null) {
                //文字列の分割とStudentクラスのインスタンス作成
                String[] splitData = line.split(",",8);
                String name = splitData[0];
                Gender gender = "男".equals(splitData[1]) ? Gender.MEN:Gender.WOMEN;
                int grade = Integer.parseInt(splitData[2]);
                int cl = Integer.parseInt(splitData[3]);
                int no = Integer.parseInt(splitData[4]);
                int jap = Integer.parseInt(splitData[5]);
                int math = Integer.parseInt(splitData[6]);
                int eng = Integer.parseInt(splitData[7]);
                studentList.add(new Student(name,gender,grade,cl,no,jap,math,eng));

                line = br.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        studentList.sort(Comparator.comparing(Student::getSum,Comparator.reverseOrder()));
        //ここのソートはまだ理解できない

        for (Student s:studentList) System.out.println(s);

        /*for(String line:readData) System.out.println(line);



        for (String line:readData){
            String[] splitData = line.split(",",8);//データを分割

            String name = splitData[0];
            Gender gender = null;
            if ("男".equals(splitData[1])){
                gender = Gender.MEN;
            }else if ("女".equals(splitData[1])){
                gender = Gender.WOMEN;
            }
            int grade = Integer.parseInt(splitData[2]);
            int cl = Integer.parseInt(splitData[3]);
            int no = Integer.parseInt(splitData[4]);
            int jap = Integer.parseInt(splitData[5]);
            int math = Integer.parseInt(splitData[6]);
            int eng = Integer.parseInt(splitData[7]);
//public Student(String name,Gender gender, int grade, int cl, int no, int jap, int math, int eng)
            Student student = new Student(name,gender,grade,cl,no,jap,math,eng);
            studentList.add(student);
        }


        for(String line:readData) System.out.println(line);

        List<Student> personList = new ArrayList<>();

        for (String line:readData){
            String[] splitData = line.split(",",3);//データを分割
            //System.out.println(splitData[0]);
            //System.out.println(splitData[1]);
            //System.out.println(splitData[2]);

            String name = splitData[0];
            Gender gender = null;
            if ("男".equals(splitData[1])){
                gender = Gender.MEN;
            }else if ("女".equals(splitData[1])){
                gender = Gender.WOMEN;
            }
            LocalDate birth = LocalDate.parse(splitData[2]);

            Person person = new Person(name,gender,birth);
            personList.add(person);
        } */
    }
}