package blog.member;

//コンストラクターとして使われるメソッド。
class Member {

    //フィールドの部分。　変数の型と変数を指定します。　※とりあえずprivateの記述は後に。
    private String id;
    private String name;
    private int rank;
    private String club;
    private String position;

//コンストラクターの代表的なメソッドを記述。代表なのでクラス名と同じメソッド名前にするのがルール。
//( )の中は必要な引数とその型を記述します。
    public Member(String id, String name, int rank, String club, String position) {

//thsi.はフィールドで記述した変数を指定してる。　=の右側の変数は↑メソッドで記述した変数。
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.club = club;
        this.position = position;
    }

//その他のメソッド。インストラクターを作るとメソッド名で呼び出せるよ！
//呼び出されたらフィールドで指定した変数を出すメソッドですね。
//ここでのreturnは変数を指定してメソッドを終わらせてる。
//このメソッドは呼び出されない限り機能は見えない。
 /*   public String getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public String getClub() {
        return club;
    }

    public String getPosition() {
        return position;
    }
*/

//オーバーライド。　上書きする処理。
//String toStringメソッドはなんでも文字列で表示してくれるメソッド。やらないとおかしな文字列で表示されちゃう
//フィールドの変数をtoStringで正しく文字列表示できるようにしつつString.formatで表示のテンプレを作ってる。%が書式の宣言でアルファベットが型を指定してるよ

   @Override
    public String toString() {
        return String.format("%s %s %d %s %s",
                id,name,rank,club,position);
    }
}