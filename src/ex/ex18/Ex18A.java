package ex.ex18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex18A {
    public static void main(String[] args) {

        //月初の曜日を求めるて空白の個数を計算
        LocalDate now = LocalDate.now();
        int offset = now.withDayOfMonth(1)//現在の月の１日の日付を指定　変数offsetには曜日が持つ値が入る。ココでは土曜日の６
                .getDayOfWeek()//曜日を呼び出して列挙型の文字列がデフォルトの戻り値（英語読み）
                .getValue() % 7;//曜日の列挙型がもつ番号を取得、日曜は0にする。　月曜から日曜が１～７のvalue値なので日曜０～土曜６にしてる。
        //System.out.println(offset);
        //System.out.println();
        //System.out.println(now.withDayOfMonth(2));
        //System.out.println(now.withDayOfMonth(2).getDayOfWeek());
        //System.out.println(now.withDayOfMonth(2).getDayOfWeek().getValue()%7);

        //月の日数を求める。
        int lengthOfMonth = now.lengthOfMonth();//今月の月末日を取得して代入
        //System.out.println(lengthOfMonth);
        //int b =0;

        //カレンダーを出力する
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM").format(now));//年月を出力　
        int day = 1;//出力する日付の初期化　日付が１日づつ増えてlineに文字列で加算されてゆく
        while (day <= lengthOfMonth) { //dayと日数が同じか日数が多いと繰り返し実行する　月末日に達するまで実行
            String line = ""; //初期化して１週間分を入れる
            for (int i = 0; i < 7; i++) { //１週間分の行をつくるfor　変数lineに文字列として貯めてく
                if (offset > 0) { //空白を作るif offsetは空白の個数が入ってるので１つ空白ができると１つ減算される
                    line += "   "; //空白の代入
                    //System.out.println("■"+line+"■");
                    offset--; //代入された分だけ減算される
                    //System.out.println(offset);
                } else { //変数lineに空白がおさまりきったらelseで日数を入れる処理
                    line += String.format("%2d ", day); //String.formatで
                    day++; //日付を増やす
                    if (day > lengthOfMonth) break;  //月末日と日数が同じになったら１週間分の列の作成終了
                }
            }
            // b++;
            System.out.println(/*b + ": " + */line);//１週間分書き出し
        }
    }
}