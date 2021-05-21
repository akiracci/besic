package objectSample.detaTimeSumple;

import java.time.LocalDateTime;

public class DateTimeSample4 {

    public static void main(String[] args) {
        //日付の計算
        LocalDateTime now = LocalDateTime.now();

        //加算
        System.out.println(now.plusYears(1));//1年増やしてる
        System.out.println(now.plusMonths(1));//１か月増やしてる
        System.out.println(now.plusWeeks(1));//１週間ふやしてる
        System.out.println(now.plusDays(1));
        System.out.println(now.plusHours(1));
        System.out.println(now.plusMinutes(1));
        System.out.println(now.plusSeconds(1));
        System.out.println(now.plusNanos(1));

        //値を調整する
        System.out.println(now.withYear(3000));
        System.out.println(now.withMonth(8));
        System.out.println(now.withDayOfMonth(5));
        System.out.println(now.withHour(20));
        System.out.println(now.withMinute(30));
        System.out.println(now.withSecond(10));
        System.out.println(now.withNano(0));
    }
}
