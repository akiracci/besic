package objectSample.optionalSample;

import java.util.Optional;

//optionalクラスの使い方２
class Optional2 {
    public static void main(String[] args) {


        //生成
        Optional<String> opt1 = Optional.ofNullable("abc");
        Optional<String> opt2 = Optional.ofNullable(null);
        //取得　ifPresent()がメソッド　ラムダ式　メソッドの省略した形　メソッドとして使い捨て　　
        opt1.ifPresent(v -> System.out.println(v));//abcが出力される
        opt2.ifPresent(v -> System.out.println(v));//値がnull実行しないでスルーされる
    }
}