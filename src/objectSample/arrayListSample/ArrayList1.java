package objectSample.arrayListSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//ArrayLisstの利用
public class ArrayList1 {
    public static void main(String[] args) {

        //List<データの型（参照型）> 変数名 = new ArrayList<>(); アレーリストの書式　　
        List<Integer> list = new ArrayList<>();

        //データの末尾への追加 list.add()で追加
        list.add(10);
        list.add(20);
        list.add(30);


        //データの取得・参照 表示
        System.out.println("index 0: "+ list.get(0));//要素0 id0ほ表示 10
        System.out.println("index 1: "+ list.get(1));//要素1 id1ほ表示 20
        System.out.println("index 2: "+ list.get(2));//要素2 id2ほ表示 30
        System.out.println(Arrays.toString(list.toArray()));//配列に変換して表示list.toArray()
        System.out.println();
        for (Integer i:list) System.out.println(i);

        System.out.println();
        list.add(1,50);//インデックス（id）1番に追加する書式。他は後ろにずれる
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println();
        //データの末尾に複数ついかする
        list.addAll(Arrays.asList(100,60,90));//配列をList変換して複数追加　配列
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println();
        //複数のデータを指定された位置に挿入する
        list.addAll(2,Arrays.asList(40,80,70));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println();
        //サイズの取得
        System.out.println(list.size());

        //データの削除
        list.remove(0);//インデクス（id）の０番を削除する
        System.out.println(Arrays.toString(list.toArray()));
        list.remove(Integer.valueOf(100));//インテジャーintの100の数値を探して削除するInteger.valueOf()
        System.out.println(Arrays.toString(list.toArray()));

        //データの複数削除(一致したもの）
        list.removeAll(Arrays.asList(40,50,100));//40,50
        System.out.println(Arrays.toString(list.toArray()));

        //データの複数削除（一致しないもの全て）
        list.removeAll(Arrays.asList(30,60,90));
        System.out.println(Arrays.toString(list.toArray()));

        //値の変更
        list.set(0,0);//インデックス０の内容を０にする
        System.out.println(Arrays.toString(list.toArray()));

        //リストのクリア値をすべて削除する
        list.clear();
        System.out.println(Arrays.toString(list.toArray()));

        //サイズの取得
        System.out.println(list.size());

        //空かどうか？　空なら　true
        System.out.println(list.isEmpty());
    }
}
