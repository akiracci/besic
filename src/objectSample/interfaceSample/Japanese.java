package objectSample.interfaceSample;

//日本人クラスのインターフェース版
class Japanese implements IfHello {
    private String name;
    public Japanese(String name){
        this.name = name;
    }

    @Override
    public void hello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}
