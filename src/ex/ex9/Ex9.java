package ex.ex9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Ex9 {
    public static void main(String[] args) {
        //1~10までの整数を格納したArrayListを作成しなさい
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        //それらを合計した値を表示しなさい
        Integer sum = 0;
        for (Integer v:list) {
            sum += v;
        }
        System.out.println("合計:" + sum);

        //それらの平均を表示しなさい
        System.out.println("平均:" + (double) sum / list.size());
    }
}