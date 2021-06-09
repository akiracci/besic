package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;

class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        //integerList.addAll(Arrays.asList(10,20,30,40,50));

        for (int i = 10; i <= 50 ; i+=10) {
            integerList.add(i);
        }

        int sum = 0;
        for (int v:integerList) {
            sum += v;
        }
        double ave = (double) sum /integerList.size();
        System.out.println(ave);

        OptionalDouble optAve = integerList.stream()
                .mapToDouble(i -> (double) i)
                .average();
        optAve.ifPresent(System.out::println);

        //ソート
        List<Integer> num1 = new ArrayList<>(Arrays.asList(100,35,72));
        num1.sort(Comparator.naturalOrder());
        num1.forEach(System.out::println);

        //型変換
        List<Integer> integerLinkedList = new LinkedList<>(integerList);
    }
}
