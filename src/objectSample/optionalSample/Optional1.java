package objectSample.optionalSample;

import java.util.Optional;

//Optionalクラスの使い方
public class Optional1 {
    public static void main(String[] args) {


        //Optoonalの生成 https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html#ofNullable(T)
        //<String>で型を指定　変数をopt1とする　Optional.of()　
        Optional<String> opt1 = Optional.of("abc");
        //取得する
        System.out.println(opt1.get());//abcが出力

        //nullで例外にしてみる
        Optional<String> opt2 = Optional.of(null);//メソッドでコンパイルエラーでて停止する。
        System.out.println(opt2.get());//ここまでたどり着かず停止してる
    }

}
