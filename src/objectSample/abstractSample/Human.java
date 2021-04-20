package objectSample.abstractSample;

//抽象クラスのサンプル
abstract class Human {
    protected String name;

    public Human(String name){
        this.name = name;
    }

    //抽象メソッド　戻り値とメソッド名と引数のみが宣言されている。処理が記述されてない。
    //処理が記述されてない
    public abstract void hello(); //処理が記述されてないのでabstractで抽象クラス。
}
