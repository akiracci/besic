package Ex.ex11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Ex11 {
    public static void main(String[] args) {
        //Personクラスを格納するArrayListを作成する
        //5人程度のインスタンスを追加する
        List<Person> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Person("あいざわ","男",25),
                new Person("おおた","女",18),
                new Person("えんどう","男",39),
                new Person("うえの","女",33),
                new Person("いのうえ","男",42)
        ));

        //一覧表示
        System.out.println("一覧表示");
        for (Person p:list) System.out.println(p);

        //年齢の降順表示
        list.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));
        System.out.println("年齢の降順");
        for (Person p:list) System.out.println(p);

        //男性で年齢の降順で出力
        List<Person> mens = new ArrayList<>();
        for (Person p:list) {
            if ("男".equals(p.getGender())) mens.add(p);
        }
        mens.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));
        System.out.println("男性で年齢の降順");
        for (Person p:mens) System.out.println(p);
    }
}