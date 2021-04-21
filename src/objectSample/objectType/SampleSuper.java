package objectSample.objectType;

//継承元のスーパークラス
class SampleSuper {
    //スーパークラスのフィールド
    protected String superFiled;

    public SampleSuper(String superFiled) {
        this.superFiled = superFiled;
    }

    public String getSuperFiled() {
        return superFiled;
    }
}