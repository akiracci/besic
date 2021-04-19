package intro;

//ラッパークラス
public class WrapperSample {
    public static void main(String[] args) {

        //整数型intのラッパー
        Integer num =10;//整数リテラルを書ける
        //Integer num = new Integer(10);と同じ

        //Integerのフィールド
        System.out.println(Integer.MAX_VALUE);//Integer型の最大値
        System.out.println(Integer.MIN_VALUE);//Integer型の最小値
        System.out.println(Integer.SIZE);//Integer型のサイズ（ビット）
        System.out.println(Integer.BYTES);//Integer型のサイズ（バイト）

        //long型に変換
        long longNum = num.longValue();/*明示的にLongへ変換
        long longNum = num; この書き方でワイドニングできる　*/
    }
}
