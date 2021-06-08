package review;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        //integerList.add("1");　List<Integer>でインテジャーを指定しているので文字はコンパイルエラー
    }
}
