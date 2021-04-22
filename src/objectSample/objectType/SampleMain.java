package objectSample.objectType;

class SampleMain {
    public static void main(String[] args) {
        //スーパークラスの型の変数定義
        //スーパークラスの型でインスタンスを作成
        SampleSuper sampleSuper = new SampleSuper("abc");
        //スーパークラスで定義されたgetSuperField()のみ使用可能
        System.out.println(sampleSuper.getSuperFiled());

        //サブクラスの型で変数定義
        //サブクラスの型でインスタンスを作成
        SampleSub1 sampleSub1 = new SampleSub1("abc");
        //サブクラスで定義された3種類のメソッドが使用できる
        System.out.println(sampleSub1.getSuperFiled());
        sampleSub1.methodA();
        sampleSub1.methodB();

        //インターフェイスMethodA型の変数を定義
        //サブクラスの型でインスタンスを作成
        IfMethodA sampleSub2 = new SampleSub1("abc");
        //インターフェイスMethodAで定義されてるメソッドのみ使用ができる
        sampleSub2.methodA();

    }
}