package objectSample.objectType;

//Superクラス
class  SuperClass{
    public void methodA(){
        System.out.println("A");
    }
}
//Subクラス
class SubClass{
    public void methodB(){
        System.out.println("B");
    }
}
//オブジェクトの型について
    class ObujectType{

        public static void main(String[] args) {
            //スーパークラスの型の変数にサブクラスは格納できる
            Object obj1 = Integer.valueOf(10);
            Object obj2 = 10.0;
            Object obj3 = "abc";

            //インスタンスの振る舞いはデータ型で制約される
        SuperClass super1 = new SuperClass();
        super1.methodA();//A
            SubClass Sub1 = new SubClass();
            Sub1.methodB();//B
            Sub2.

            SuperClass sub2 = new SubClass();
            sub2.methodA();//A


            SUbClass sub3 =(SUbClass)
        }
    }

