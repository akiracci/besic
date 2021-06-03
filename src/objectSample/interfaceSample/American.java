package objectSample.interfaceSample;

//アメリカ人クラス インターフェイス版
class American implements IfHello {
    private String name;

    public American(String name) {
        this.name = name;
    }

    @Override
    public void hello() {
        System.out.println("Hello my name is " + name + ".");
    }
}
