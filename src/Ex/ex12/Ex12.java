package Ex.ex12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//名前の完全一致で検索する
class Ex12 {
    //別解
    public static boolean containsName(String name,List<Person> list) {
        for (Person p:list) {
            if (p.getName().equals(name)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
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
        for (Person p :list) System.out.println(p);

        //検索する名前の入力
        Scanner in = new Scanner(System.in);
        System.out.println("検索する名前を入力");
        String name = in.nextLine();

        //名前のリストを作成する
        List<String> nameList = new ArrayList<>();
        for (Person p:list) {
            nameList.add(p.getName());
        }
        //検索する
        if (nameList.contains(name)) {
            System.out.println(name + "は存在します");
        } else {
            System.out.println(name + "は存在しません");
        }

        //別解
        if (containsName(name,list)) {
            System.out.println(name + "は存在します");
        } else {
            System.out.println(name + "は存在しません");
        }
    }
}