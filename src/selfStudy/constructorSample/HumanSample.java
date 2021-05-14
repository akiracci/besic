package selfStudy.constructorSample;

//人間クラスのインスタンスを作成する
public class HumanSample {
    public static void main(String[] args) {
        //インスタンスをさくせいする
        //Human human1 = new Human("やまだ","男",35);
        Humans human2 = new Humans("高田","女",22);
        Humanss human3 = new Humanss("1","さとし","田中");
//試し。privateをpublicに変する

//各データを表示する
        System.out.println(new Human("やあだ","おとこ",23));
        //System.out.println(human1.getNama());
        //System.out.println(human1.getGeder());
        //System.out.println(human1.getAge());
        //System.out.println(human1);
        System.out.println();
        System.out.println(human2.getNama());
        System.out.println(human2.getGeder());
        System.out.println(human2.getAge());
        System.out.println(human2);
        System.out.println(human3);
    }
}
