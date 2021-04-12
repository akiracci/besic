package Ex;

import java.util.Arrays;

//配列の最大値、最小値、平均値を表示する
public class Ex5 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};//[]は配列で{}が配列の要素　
        int max = array[0];//仮の最大値
        int min = array[0];//仮の最小値
        int sum = 0;//合計を初期化
        double ave = 0.0;//平均を初期化


        //各値を見つける
        for (int value:array) { //配列arrayをvalueに入れる。{}の中は繰り返し処理される
            if (max < value) max = value;//最大値　( )の中のmaxがvalueより小さいときmaxにvalueを入れる。全ての要素を繰り返して最大値が残る
            if (min > value) min = value;//最小値　( )の中のminがvalueより大きいときminにvalueを入れる。全ての要素を繰り返して最大値が残る
            sum += value;//合計の計算　sumにvalueを足して行く。全ての要素を足す。
        }//forの処理ここまで繰り返される。配列[]なので要素の全てを繰り返す。
        ave = sum / array.length;//平均を求める　lengthでデータの個数を数えている。

        //結果の出力
        System.out.println(Arrays.toString(array));//元の配列の表示
        System.out.println(String.format("max:%d min:%d ave:%.2f",max,min,ave));//ストリングフォーマットで簡単に表示
    }
}
