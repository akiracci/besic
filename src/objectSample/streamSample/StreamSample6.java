package objectSample.streamSample;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;


//streamのいろいろ
public class StreamSample6 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5);

        //一覧
        System.out.println("元のデータ" + integerList);

        //合計を求める
        int sum =integerList.stream()
                .mapToInt(i -> i)//IntStreamに変換
                .sum();//合計を求める
        System.out.println("合計を求める "+ sum);//15

        //平均を求める
        OptionalDouble ave = integerList.stream()
                .mapToDouble(i -> (double) i)
                .average();

        System.out.println("平均を求める " + ave.orElse(0));

        //データの個数を求める
        long count = integerList.stream()
                .filter(i -> i %2 ==1)//奇数になる値だけ抽出
                .count();//数を数える
        System.out.println("データの個数を求める " + count);

        //最小値を求める
        Optional<Integer> min = integerList.stream()
                .min(Comparator.naturalOrder());
        System.out.println("最小値を求める " + min.orElse(0));

        //最大値を求める
        Optional<Integer> max = integerList.stream()
                .max(Comparator.naturalOrder());
        System.out.println("最大値を求める " + min.orElse(0));

        //処理の範囲を限定する
        int sum2 = integerList.stream()
                .skip(2)//値ぶんの要素を飛ばして処理の開始
                .limit(2)//値ぶんの処理をする
                .mapToInt(i->i)//整数値にする
                .sum();//合計
        System.out.println("処理の範囲を限定する " +sum2);
    }
}
