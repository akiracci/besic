package objectSample.exceptionSample;

//例外が発生してる状態。ExceptionSample2以降で処理の仕方を記述
public class ExceptionSample1 {
    public static void main(String[] args) {
        String str1 = "abc", str2 = null;
        System.out.println(str1.length());
        System.out.println(str2.length());//str2がnullのため実行時例外が発生
    }
}
