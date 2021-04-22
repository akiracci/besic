package objectSample.objectType;

//サブクラス１
class SampleSub1 extends SampleSuper implements IfMethodA,IfMethodB {
    public SampleSub1(String superFiled) {
        super(superFiled);
    }

    @Override
    public void methodA() {
        System.out.println("A");
    }

    @Override
    public void methodB() {
        System.out.println("B");
    }
}