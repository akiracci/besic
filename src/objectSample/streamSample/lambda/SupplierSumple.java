package objectSample.streamSample.lambda;


import java.util.function.Supplier;

//Supplier　インターフェースクラス
//引数なしで戻り値のみあり　get()ゲッターの変わり
public class SupplierSumple {
    public static void main(String[] args) {
        class Test{}
        Supplier<String> supplier1 = () -> "abc";
        Supplier<Test> supplier2 = () -> new Test();

        System.out.println(supplier1.get());
        Test test = supplier2.get();//インスタン作成
    }
}
