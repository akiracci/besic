package objectSample.mapSample;

import java.util.*;

//mapの活用
public class Map2 {
    //List→Mapの変換
    private static Map<String,Member> toMap(List<Member> member){
        Map<String,Member> memberMap = new HashMap<>();
        for(Member m : member){
            memberMap.put(m.getId(),m);
        }
        return memberMap;
    }
    public static void main(String[] args) {
        //MemberのArrayListを作成する
        List<Member> member = new ArrayList<>();
        member.addAll(Arrays.asList(
                new Member("1","Tom"),
                new Member("2","Bob"),
                new Member("3","Jhon")

        ));
        //一覧を表示
        System.out.println(member);

        //ArrayListからの変換
        Map<String,Member> map = toMap(member);
        System.out.println(map);

        //検索
        String key = "1";
        if (map.containsKey(key)){
            //存在してる変数
            System.out.println(map.get(key));
        } else {//存在していない場合
            System.out.println("key:" + key + "は見つかりません");
        }
    }
}
