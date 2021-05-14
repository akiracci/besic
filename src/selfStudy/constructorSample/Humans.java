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


    @Override
    public String toString() {
        return nama + geder + age /*"Human{" +
                "nama='" + nama + '\'' + // \' エスケープシーケンス
                ", geder='" + geder + '\'' +
                ", age=" + age +
                '}'*/;
    }

}

class Humanss {
    String no;
    String fast;
    String middle;
    public Humanss(String no, String fast, String middle){
        this.no = no;
        this.fast = fast;
        this.middle = middle;
    }

    public String getNo() {
        return no;
    }

    public String getFast() {
        return fast;
    }

    public String getMiddle() {
        return middle;
    }

    @Override
    public String toString() {
        return "Humanss{" +
                "no='" + no + '\'' +
                ", fast='" + fast + '\'' +
                ", middle='" + middle + '\'' +
                '}';
    }
}


