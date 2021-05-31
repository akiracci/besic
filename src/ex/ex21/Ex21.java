package ex.ex21;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex21 {
    public static void main(String[] args) {
        //1から100までの整数型ArrayListを作成する。
        List<Integer> integerList = IntStream.rangeClosed(1,100).boxed()
                .collect(Collectors.toList());
        //.collect(Collectors.toList())でリストに変換してる。

        integerList.stream()
                .filter(i -> i % 2 == 0)//偶数のみを処理する
                .map(i -> i * 3)//対象の数値を3倍する
                .sorted(Comparator.reverseOrder())//数値の大きいものから表示する
                .forEach(System.out::println);
    }
        }

        //偶数のみ処理をする
        //対象の数値を３倍する
        //数値の大きいものから表示する


