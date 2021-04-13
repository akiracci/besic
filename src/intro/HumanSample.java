package intro;

//人間クラスのインスタンスを作成する
public class HumanSample {
    public static void main(String[] args) {
        //インスタンスをさくせいする
Human human1 = new Human("やまだ","男",35);
//試し。privateをpublicに変する

//各データを表示する
        System.out.println(human1.getNama());
        System.out.println(human1.getGeder());
        System.out.println(human1.getAge());
        System.out.println(human1);
    }
}
