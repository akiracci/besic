package objectSample.objectType;

//Superクラス
class SuperClass {
    public void methodA() {
        System.out.println("A");
    }
}
//Subクラス
class SubClass extends SuperClass {
    public void methodB() {
        System.out.println("B");
    }
}

//オブジェクトの型について
class ObjectType {
    public static void main(String[] args) {
        //スーパークラスの型の変数にサブクラスは格納できる
        Object obj1 = Integer.valueOf(10);
        Object obj2 = Double.valueOf(10.0);
        Object obj3 = String.valueOf("abc");

        //インスタンスの振る舞いはデータ型で制約される
        SuperClass super1 = new SuperClass();
        super1.methodA();//A
        SubClass sub1 = new SubClass();
        sub1.methodA();//A
        sub1.methodB();//B

        SuperClass sub2 = new SubClass();
        sub2.methodA();//A
        //methodB()は使用不可

        SubClass sub3 = (SubClass) sub2;//キャスト演算子で型変換
        sub3.methodA();
        sub3.methodB();//ともに再び使える

    }
}