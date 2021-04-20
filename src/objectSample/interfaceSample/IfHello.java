package objectSample.interfaceSample;

//インターフェースhelloを作成する
//インターフェースは抽象メソッドを記述する
public interface IfHello {
    //abstractは不要
    //インターフェースに記述するのは抽象メソッドため
    //オブジェクトの振る舞い（メソッド）だけを記述したものがインターフェース
    //抽象メソッドのみを記述するのがインターフェース
    //継承は使われない
    //public abstractメソッドしか定義できないので記述が不要
    void hello();
}
