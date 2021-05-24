package objectSample.detaTimeSumple;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeSample1 {
    public static void main(String[] args) {


        //現在日時
        LocalDate nowDate = LocalDate.now();//現在の日付を取得
        LocalTime nowTime = LocalTime.now();//現在の時間を取得
        LocalDateTime nowDeteTime = LocalDateTime.now();
        System.out.println(nowDate);
        System.out.println(nowDate);
        System.out.println(nowDeteTime);
        System.out.println();
        //任意の日時を指定
        LocalDate someDate = LocalDate.of(1981,11,25);
        LocalTime someTime = LocalTime.of(18,0,0);
        LocalDateTime someDateTime = LocalDateTime.of(1981,Month.NOVEMBER,25,0,0);
        System.out.println(someDate);
        System.out.println(someTime);
        System.out.println(someDateTime);
        System.out.println();

        //日付文字列から ISO形式の文字列から

        LocalDate parthDate = LocalDate.parse("2020-01-01");
        LocalTime parthTime = LocalTime.parse("20:00:00");
        LocalDateTime parthDateTime = LocalDateTime.parse("2020-01-01T21:00:00");
        System.out.println(parthDate);
        System.out.println(parthTime);
        System.out.println(parthDateTime);
    }
}
