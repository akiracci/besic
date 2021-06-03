package objectSample.interfaceSample;

//中国人クラス インターフェイス版
class Chinese implements IfHello {
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public void hello() {
        System.out.println("我的名字是" + name + "。");
    }
}
