package objectSample;

//finalのサンプル
class SuperClass {
    //再代入不可なので定数、変数名はすべて大文字で記述
    protected final String CONST_WORD = "abc";

    //メソッドにfinalがつくとオーバーライド不可
    public final String getCONST_WORD() {
        return CONST_WORD;
    }
}

//SuperClassを継承したSub1を作成 finalがつくと継承不可になる
final class Sub1 extends SuperClass {
    //SuperClassからフィールドとメソッドを継承
}

//class sub2 extends sub1 { } これはコンパイルエラー
final class Sub2 extends SuperClass {
    //オーバーライドが出来ないのでコンパイルエラー
//    public final String getCONST_WORD() {
//        return CONST_WORD;
//    }
}

public class FinalSample {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();//デフォルトコンストラクタ
        System.out.println(superClass.getCONST_WORD());//abc
        Sub1 sub1 = new Sub1();
        System.out.println(sub1.getCONST_WORD());//abc
    }
}