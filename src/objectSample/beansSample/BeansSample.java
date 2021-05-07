package objectSample.beansSample;

import java.util.ArrayList;
import java.util.List;

//beansの活用
class BeansSample {
    public static void main(String[] args) {
        List<StudentBeans> list = new ArrayList<>();
        //各項目のデータを用意する
        String name = "やまだ";
        int grade = 1 ;
        int cl = 1 ;
        int no = 20 ;
        int jap = 80;
        int math = 70;
        int eng = 60;

        //Beansに追加する

        StudentBeans studentBean = new StudentBeans(); //空のインスタンスを作成
        studentBean.setName(name);
        studentBean.setGrade(grade);
        studentBean.setCl(cl);
        studentBean.setNo(no);
        studentBean.setJap(jap);
        studentBean.setMath(math);
        studentBean.setEng(eng);


    }
}
