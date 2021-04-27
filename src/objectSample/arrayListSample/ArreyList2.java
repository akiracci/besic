package objectSample.arrayListSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArreyList2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Tom","Bob","Jhon"));


        //要素の検証
        if (list.contains("Bob")) {
            //Bobは存在する時
            int index = list.indexOf("Bob");
            System.out.println(index + ":" + list.get(index));
        }
    }
}
