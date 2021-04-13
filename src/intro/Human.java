package intro;

//人間クラス
class Human {
    //フィールド
    private String nama;
    private String geder;
    private int age;

    @Override
    public String toString() {
        return "Human{" +
                "nama='" + nama + '\'' + // \' エスケープシーケンス
                ", geder='" + geder + '\'' +
                ", age=" + age +
                '}';
    }

    //コンストラクター
    public Human(String name, String geder, int age) {
        this.nama = name;
        this.geder = geder;
        this.age = age;
    }
    //ゲッター　
//アクセス装飾子　戻り値　メソッド
    public String getNama() {
        return nama;
    }

    public String getGeder() {
        return geder;
    }

    public int getAge() {
        return age;
    }
}


