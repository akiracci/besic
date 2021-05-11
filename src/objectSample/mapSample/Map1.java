package objectSample.mapSample;

import java.util.HashMap;
import java.util.Map;

//mapのサンプル
public class Map1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(); //KとVすなわちKeyとValueを指定するので<>の中は二つの型を指定

        //Kyeはインデックス扱いなので重複ないよ。

        map.put("Apple","りんご"); //Appleがkey　りんごがValue
        map.put("Banana","バナナ");
        map.put("Orange","オレンジ");
        //一覧の表示
        System.out.println(map);
        //for命令による表示
        //データ型Map.Entry<String,String>
        //entrySet()は人組み合わせを取り出す
        for(Map.Entry<String,String> entry : map.entrySet()){ //変数entryに　map.entrySetで入れ込んでfor繰り返し処理。
            System.out.println(entry.getKey() + ":" + entry.getValue()); //entry.getKey()でKeyから取り出しentry.getValue()でValueをとりだす
        }

        //Keyを指定して要素を所得
        System.out.println(map.get("Apple"));//Valueの値が所得されます
        //存在しない値を所得しようとする
        System.out.println(map.get("abc"));//存在しない値なのでnullが返される

        //Keyが存在することを確認してからget
        if (map.containsKey("Apple")) {
            System.out.println(map.get("Apple"));
        } else {
            System.out.println("Key:Appleは存在しません");
        }
        //値の存在を調べる
        String word = "りんご";
        if (map.containsValue(word)) {
            System.out.println(word + "は存在します");

        } else {
            System.out.println(word +"は存在しません");
        }

        //値の変更
        System.out.println(map);
        System.out.println(map.put("Apple", "リンゴ") + "　変更前の値表示をしています");//以前の値を返す
        System.out.println(map);

        //Keyの集合を取得
        System.out.println(map.keySet());//Keyの値の一覧が表示されます

        //値のコレクションを取得
        System.out.println(map.values());//Valueの値の一覧が表示されます

        //Keyを指定して値の削除
        String key ="Apple";
        if (map.containsKey(key)) {
            map.remove(key);
        }
        System.out.println(map);
    }
}
