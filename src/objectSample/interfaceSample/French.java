package objectSample.interfaceSample;

//フランス人クラス インターフェイス版
class French implements IfHello {
    private String name;

    public French(String name) {
        this.name = name;
    }

    @Override
    public void hello() {
        System.out.println("Je m'appelle " + name + ".");
    }
}
