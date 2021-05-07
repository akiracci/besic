package objectSample.setSample;

import java.util.*;
//重複されるデータをまとめて扱うためのインターフェース
//Setサンプル
public class Set1 {
    public static void main(String[] args) {
        //整数型HashSet
        Set<Integer> set = new HashSet<>();
        //データを追加するメソッド↓
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        //表示する
        System.out.println(set);
        //存在する値はついかされない
        System.out.println(set.add(1) + "　出力するとfalseが返されます");//false
        System.out.println(set);
        //存在しない値は追加される
        System.out.println(set.add(6));//true
        System.out.println(set);
        //値を複数追加する
        set.addAll(Arrays.asList(7,8,9));//true
        System.out.println(set);
        //追加できる値と追加できない値の混同
        System.out.println(Arrays.asList(9,10));//false
        System.out.println(set);
        //値を削除する
        System.out.println(set.remove(10));//true
        System.out.println(set);
        System.out.println(set.remove(10));//false
        System.out.println(set);
        //合致する値をすべて削除する
        System.out.println(set.removeAll(Arrays.asList(7,8,9)));//true
        System.out.println(set);
        System.out.println(set.removeAll(Arrays.asList(6,7)));//true
        System.out.println(set);
        System.out.println(set.removeAll(Arrays.asList(6,7)));//false
        System.out.println(set);
        //合致しない値を全て削除する
        System.out.println(set.retainAll(Arrays.asList(1,2,3)));//true
        System.out.println(set);
        //値を全て削除する
        set.clear();
        System.out.println(set +"値がなくなり表示されない");//void 返り値がない

        //サイズの取得
        System.out.println(set.size());//0
        //空であるかどうかの真偽判定
        System.out.println(set.isEmpty());//true
        set.add(1);
        System.out.println(set.isEmpty());//false
        //ArrayListからset配列に変換する
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,3,3));
        System.out.println(list);//1,2,2,3,3,3
        //重複されるデータが削除されてset配列に変換される
        Set<Integer> integerSet = new HashSet<>(list);
        System.out.println(integerSet);//1,2,3
        //値の存在を判定する
        System.out.println(integerSet.contains(2) + "2は保持している値なのでtrueを返してます");//true
        System.out.println(integerSet.contains(4) + "4は持たない値なのでfalseで返してます");//false
        System.out.println(integerSet.containsAll(Arrays.asList(1, 2, 3)) + "　全て保持しているのでtrueをかえしてまてます");
        System.out.println(integerSet.containsAll(Arrays.asList(1, 2, 4))+ "　4は持たない値なのでfalseをかえしてまてます");

    }
}
