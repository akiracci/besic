package objectSample.streamSample;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Stream中間処理　１６１p １６４p
public class StreamSample2 {

    public static void main(String[] args) {

//整数の値のみ扱うStream　Integerクラス型
    List<Integer> integerList = IntStream.rangeClosed(1,10).boxed()
            .collect(Collectors.toList());

    //中間処理
    integerList.stream()

            //mapで要素を１０倍
            .map(i -> i * 10)

            //filterで３で割り切れるものi%3だけにする
            .filter(i -> i % 3 == 0)

            //sortedでソートComparator.reverseOrder()で降順に
            .sorted(Comparator.reverseOrder())

            //終端操作forEach（フォーイーチ）　インテリJでは　soutc　でラムダ式表示
            .forEach(System.out::println);

    }
}
