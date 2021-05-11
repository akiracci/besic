package objectSample.enumSample;

//enumのサンプル
//定数を定義しているクラスファイルです
enum Color {
    RED("赤"),
    BLUE("青"),
    YELLOW("黄");

    //フィールド
    private String jpName;

    private Color(String jpName){
        this.jpName = jpName;
    }

    public String getJpName() {
        return jpName;
    }
}
