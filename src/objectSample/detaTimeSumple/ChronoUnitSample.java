package objectSample.detaTimeSumple;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class ChronoUnitSample {
    public static void main(String[] args) {
        //経過時間のサンプル
        LocalDateTime birthDay = LocalDateTime.of(1981,11,25,18,0,0);

        System.out.println(ChronoUnit.SECONDS.between(birthDay, LocalDateTime.now()));
        System.out.println(ChronoUnit.MINUTES.between(birthDay, LocalDateTime.now()));
        System.out.println(ChronoUnit.HOURS.between(birthDay, LocalDateTime.now()));
        System.out.println(ChronoUnit.DAYS.between(birthDay, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(birthDay, LocalDateTime.now()));
    }
}