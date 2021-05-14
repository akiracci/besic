package objectSample.optionalSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//optionalクラスの使い方２
class Optional4 {
    public static void main(String[] args) {


        //生成
        Optional<String> opt1 = Optional.ofNullable("abc");
        Optional<String> opt2 = Optional.ofNullable(null);

        //Nullの場合、別の値を返す nullの場合.orElse()の中の値を返す
        System.out.println(opt1.orElse("xyz"));//abcが表示される
        System.out.println(opt2.orElse("xyz"));//xyzが表示される

        //Nullかどうか判定する.isPresent()
        System.out.println(opt1.isPresent());//trueが表示
        System.out.println(opt2.isPresent());//falseが表示される

        //値をフィルターする
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#filter(java.util.function.Predicate)
        List<Optional<Integer>> optionalList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            optionalList.add(Optional.ofNullable(i));
        }

        //v -> v >= 5 がtrueなら値の入っているOptionalを返す
        //空で無ければ出力をする
        System.out.println("値のフィルター");
        for (Optional<Integer> opt:optionalList) {
            opt.filter(v -> v >= 5).ifPresent(v -> System.out.println(v));
        }

        //値を加工する
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#map(java.util.function.Function)
        System.out.println("値を加工する");
        for (Optional<Integer> opt:optionalList) {
            opt.map(v -> v*2).ifPresent(v -> System.out.println(v));
        }

    }
}