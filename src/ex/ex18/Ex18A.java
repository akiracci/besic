package ex.ex18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex18A {
    public static void main(String[] args) {

        //月初の曜日を求めるて空白の個数を計算
        LocalDate now = LocalDate.now();
        int offset = now.withDayOfMonth(1)//１日にする
                .getDayOfWeek()//曜日の列挙型を取得（英語読み）
                .getValue() % 7;//曜日の列挙型がもつ番号を取得、日曜は0にする。　月曜から日曜が１から７のvalue値なので日曜０～土曜６にしてる。
        System.out.println(offset);
        System.out.println();
        System.out.println(now.withDayOfMonth(2));
        System.out.println(now.withDayOfMonth(2).getDayOfWeek());
        System.out.println(now.withDayOfMonth(2).getDayOfWeek().getValue()%7);

        System.out.println();
        //月の日数を求める。
        int lengthOfMonth = now.lengthOfMonth();
        //System.out.println(lengthOfMonth);

        //カレンダーを出力する。
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM").format(now));//年月を出力　
        int day = 1;//出力する日付の初期化
        while (day <= lengthOfMonth) {//dayと日数が同じか日数が多いと繰り返し実行する
            String line = "";//出力する行の設定　
            for (int i = 0; i < 7; i++) { //iは0 iが７より大きければ処理を繰り返す　繰り返しに戻ったらiに１加える
                if (offset > 0) { //空白が入る列を作るif 1ラップするごとにoffsetの数が減り空白は増える
                    line += "   ";//空白の出力
                    System.out.println("■"+line+"■");
                    offset--;//空白の減算
                    System.out.println(offset);
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
