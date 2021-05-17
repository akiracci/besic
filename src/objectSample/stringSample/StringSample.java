package objectSample.stringSample;


import java.util.Arrays;
import java.util.List;

//文字列の結合
public class StringSample {
    public static void main(String[] args) {
    String str1 ="abc",str2 = "def";
    //str1 + str2　実変数の文字列を+で結合
        System.out.println(str1 + str2);

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#concat(java.lang.String)
        System.out.println(str1.concat(str2));

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#join(java.lang.CharSequence,java.lang.CharSequence...)
        System.out.println(String.join("", str1, str2));

        List<String> stringList = List.of("a","b","c");
        String.join(",",stringList);//abc


        //文字列の比較
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#equals(java.lang.Object)
        //equals
        System.out.println("abc".equals("abc"));
        System.out.println("abc".equals("ABC"));

        //compareTo Unicode（ユニコード）で比較して　int型で返される。
        System.out.println("abc".compareTo("abc"));//0　同じなので0
        System.out.println("abc".compareTo("ABC"));//32　"abc"と比較して"ABC"が先にUnicodeで先に登録されれるので正の数
        System.out.println("abc".compareTo("xyz"));//-32　"abc"と比較して"ABC"が先にUnicodeで後に登録されれるので負の数

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#equalsIgnoreCase(java.lang.String)
        //大文字小文字を区別なく比較するtrueかfalseで返す
        System.out.println("abc".equalsIgnoreCase("ABC"));//true


        //■文字列の状態検査
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#isBlank()
        //文字列が空であるか、white spaceコード・ポイント（空白）のみが含まれている場合はtrue、そうでない場合はfalse
        System.out.println("".isBlank());//true 　なにもない空
        System.out.println(" ".isBlank());//true　半角スペース
        System.out.println("　".isBlank());//true　全角スペース

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#isEmpty()
        //length()が0の場合はtrue、それ以外の場合はfalse
        System.out.println("".isEmpty());//true 　なにもない空
        System.out.println(" ".isEmpty());//false　半角スペース
        System.out.println("　".isEmpty());//false　全角スペース


        //指定した文字で始まるかを判定　tureかfalse
        System.out.println("ピカチュー".startsWith("ピカ"));//ture
        System.out.println("ピチュー".startsWith("ピカ"));//false


        //指定した文字で終わるかを判定
        System.out.println("あきこ".endsWith("こ"));
        System.out.println("ゆかり".endsWith("こ"));


        //大文字・小文字
        System.out.println("abc".toUpperCase());
        System.out.println("ABC".toLowerCase());


        //前後の空白を取り除く
        //.trim()半角の削除
        System.out.println(" This is a pen.   ".trim());
        //.strip()全角も半角も削除
        System.out.println(" This is a pen.　 　".strip());
        //.stripLeading()前方の空白だけを削除
        System.out.println("　This is a pen.　 　".stripLeading());
        //.stripTrailing()後方の空白だけを削除
        System.out.println(" This is a pen.　 　".stripTrailing());


        //文字列の長さを調べる
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#length()
        System.out.println("あい123".length());//5
        //サロゲートペアだと長さが倍になる
        System.out.println("𠀋あ𠀋".length());//5
        //.codePointCountソロゲートペアの文字列もカウントする。（何文字目からかぞえるか,数える文字.length())
        System.out.println("𠀋あ𠀋".codePointCount(0,"𠀋あ𠀋".length()));//3


        //文字列を分割する
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#split(java.lang.String)
        //.split()指定した文字（文字列も）を区切り文字として文字列を配列にする
        String data = "やまだ,男,29";
        String[] dataArray = data.split(",");
        System.out.println(Arrays.toString(dataArray));
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#split(java.lang.String,int)
        System.out.println(Arrays.toString(data.split(",", 2)));
        String data2 = "やまだ,男,";
        System.out.println(Arrays.toString(data2.split(",")));
        System.out.println(Arrays.toString(data2.split(",",3)));
        String data3 = "やまだ,男,29,a";
        System.out.println(Arrays.toString(data3.split(",")));
        System.out.println(Arrays.toString(data3.split(",",3)));


        //任意の１文字を取得する
        //
        //.charAt()インデックスの順番を指定して１文字取り出す
        System.out.println("abc".charAt(1));//b (1)なのでインデックス0始まりで１は２文字目


        //文字の部分取得
        https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#substring(int)
        System.out.println("abcdef".substring(2));//cdef　３文字め以降を取得
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#substring(int,int)
        System.out.println("abcdef".substring(2, 4));//cd ３文字目から４文字目を取得

        //文字列の置き換え
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#replace(java.lang.CharSequence,java.lang.CharSequence)
        System.out.println("ABAABAAABA".replace("AB", "c"));//cAcAAcA 置き換えてる

        https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#replaceAll(java.lang.String,java.lang.String)
        //正規表現としておきかえ　
        System.out.println("ABAABAAABA".replaceAll("A{2}", "c"));//ABcBcAB Aが{2}つ続くところを置き換えてる。
        System.out.println("ABAABAAABA".replaceFirst("A{2}", "c"));//ABcBAAABA　最初のAが{2}つ続くところだけを置き換えてる。


        //文字列を繰り返す
        System.out.println("ねこ".repeat(10));


        //文字列の検索
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#indexOf(int)
        //指定された文字が最初に出現する位置のインデックスを返します。
        System.out.println("abcdef".indexOf("c"));//2 cは二文字目なので２
        System.out.println("abcdef".indexOf("ab"));//0 abのaは最初にあるので0
        System.out.println("abcdef".indexOf("ce"));//-1 なんかしらんけど無いからマイナス表示
        System.out.println("abcdef".indexOf("be"));

        String word = "にっこうこくりつこうえん";
        String kye = "こう";

        if (word.indexOf(kye) >= 0){
            System.out.println(kye + "は" + (word.indexOf(kye) + 1) + "文字目に発見");
        } else {
            //キーが発見できないとき
            System.out.println(word);
            System.out.println(kye + "はありません");
        }


        if (word.lastIndexOf(kye) >= 0){
            System.out.println(kye + "は" + (word.lastIndexOf(kye) + 1) + "文字目に発見");
        } else {
            //キーが発見できないとき
            System.out.println(word);
            System.out.println(kye + "はありません");
        }

        //Unicodeのコードポイントを返す
        System.out.println(Integer.toHexString("ABC".codePointAt(0)));//41
        System.out.println(Integer.toHexString("ABC".codePointAt(1)));//42


        //キーワードがいくつ含まれるか調べる
        int fromIndex =0, count = 0, find = -1;
        while (fromIndex < word.length()){
            find = word.indexOf(kye,fromIndex);//検索
            if(find>=0){
                count++;//文字列をカウント
                fromIndex = find + kye.length();//検索の開始位置を更新
            } else {
                break;
            }
        }
        System.out.println("検索対象：" + word);
        System.out.println("キーワード：" + kye);
        System.out.println("発見した個数：" + count);
    }

}
