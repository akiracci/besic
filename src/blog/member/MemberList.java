package blog.member;

public class MemberList {
    public static void main(String[] args) {

//Memberクラス型を配列で扱い　変数membersに入れるよの記述。　
//クラスで作ったコンストラクターに値を当てはめて変数に入れる事でインスタンスとしてできあがります
        Member[] members = {

//newでMemberクラスのメソッドを呼び出して実引数を指定してます。
//newでクラスを呼びだした時は入れる変数の型もクラスの型にしないとならない。
//( )の中にコンストラクターで決めた引数の実際に必要な値をいれてきます。型もあわせてね！
                new Member("1","かわい", 1, "吹奏楽", "いきもの"),
                new Member("2","きよふじ", 2, "新聞", "委員長"),
                new Member("3","しんどう", 3, "サッカー", "給食")
        };

//出来上がったインスタンスをつかって繰り返し表示するfor文のメソッド。
//データがあるぶんだけ繰り返す書き方してる。拡張for文なので理解してないと構造が読みにくい。
        for (Member member : members) {
            System.out.println(member);
        }
    }
}