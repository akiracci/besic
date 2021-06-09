package review;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("A","赤");
        map.put("B","黄");
        map.put("C","青");
        //キーを指定して値を取得
        System.out.println("map.get(\"B\"): " + map.get("B"));
        System.out.println("map.get(\"D\"): " + map.get("D"));
        //forでの例文
        //キーと値
        for (Map.Entry<String,String> entry :map.entrySet()){
            System.out.println("entry.getKey() + \":\" + entry.getValue(): " + entry.getKey() + ":" + entry.getValue());
        }
        //キーのみ
        for (String key:map.keySet()){
            System.out.println("key: " + key);
        }
        //値のみ
        for (String value: map.values()){
            System.out.println("value: " + value);
        }
        //ラムダ式キーと値を表示
        map.forEach((k,v) -> System.out.println(k + ":" + v));

        //存在確認
        System.out.println(map.containsKey("b"));
        System.out.println(map.containsKey("z"));
        System.out.println(map.containsValue("黄"));
        System.out.println(map.containsValue("白"));

        //要素の数
        System.out.println(map.size());//3
        map.clear();//コレクションの全削除
        System.out.println(map.size());//0
        System.out.println(map.isEmpty());//true

        //追加と更新
        map.put("a","赤");//aの赤を追加
        map.forEach((k,v) -> System.out.println(k + ":" + v));//a:赤
        map.replace("a","オレンジ");//aをオレンジに書き換え
        map.forEach((k,v) -> System.out.println(k +":" +v));//a:オレンジ
        System.out.println("これなに？　" + map.put("a", "赤"));//map.putでキーaをオレンジから赤に書き換えているが、表示はオレンジ
        map.forEach((k,v) -> System.out.println(k + ":" + v));//ここではキーa値赤で表示さてる。

        //削除
        map.remove("a");//aのキーを指定して削除
        System.out.println(map.isEmpty());//true　削除されるのでtrue
    }
}
