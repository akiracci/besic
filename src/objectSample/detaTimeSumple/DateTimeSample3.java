package objectSample.detaTimeSumple;

import java.time.LocalDate;

public class DateTimeSample3 {


    public static void main(String[] args) {
        //月末日のの求め方
        for (int i = 1; i <=12; i++) {
            LocalDate date =LocalDate.of(2020,i,1); //任意の日時を指定して
            System.out.println(String.format(
                    "%d-%02d-",
                    date.getYear(),
                    date.getMonthValue())
                    +date.lengthOfMonth()//月の長さ。月末日がでる
            );

        }

        //曜日の求め方
       // LocalDate now = LocalDate.now();
        //System.out.println(now + " " + now.getDayOfWeek());
    }
}
