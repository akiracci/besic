package selfStudy.constructorSample;

//人間クラス
class Humans {
    //フィールド
    private String nama;
    private String geder;
    private int age;



    //コンストラクター
    public Humans(String name, String geder, int age) {
        this.nama = name;
        this.geder = geder;
        this.age = age;
    }
    //ゲッター　
//アクセス装飾子　戻り値の型　メソッド　return文　戻り値
    public String getNama() {
        return nama;
    }

    public String getGeder() {
        return geder;
    }

    public int getAge() {
        return age;
    }


    /* @Override
    public String toString() {
        return "Human{" +
                "nama='" + nama + '\'' + // \' エスケープシーケンス
                ", geder='" + geder + '\'' +
                ", age=" + age +
                '}';
    } */
}


