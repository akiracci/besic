package ex.ex18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex18 {
    public static void main(String[] args) {
        //月初の曜日を求めるて空白の個数を計算
        LocalDate now = LocalDate.now();
        int offset = now.withDayOfMonth(1)//１日にする
                .getDayOfWeek()//曜日の列挙型を取得
                .getValue()/* % 7 */;//その番号を取得、日曜は0にする。
        System.out.println(offset);

        //月の日数を求める。
        int lengthOfMonth = now.lengthOfMonth();
        //System.out.println(lengthOfMonth);

        //カレンダーを出力する。
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM").format(now));//見出しの出力
        int day = 1;//出力する日付の設定
        while (day <= lengthOfMonth) {
            String line = "";//出力する行の設定
            for (int i = 0; i < 7; i++) {
                if (offset > 0) {
                    line += "   ";//空白の出力
                    offset--;//空白の減算
                } else {
                    line += String.format("%2d ", day);
                    day++;//日付を増やす
                    if (day > lengthOfMonth) break;
                }
            }
            System.out.println(line);
        }
    }
}
