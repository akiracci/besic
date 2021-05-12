package objectSample.exceptionSample;

//例外のキャッチの例
public class ExceptionSample2 {
    public static void main(String[] args) {
        String str1 = "abc", str2 = null;
        try {
            System.out.println(str1.length());
            System.out.println(str2.length());//str2がnullのため実行時例外が発生


        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("例外が発生しました");
        }
    }
}