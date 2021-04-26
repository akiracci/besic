package objectSample.alleyListSample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Arraylist3 {
    public static void main(String[] args) {
        List<Sample> sample = new ArrayList<>();
        sample.add(new Sample("Tom",30));
        sample.add(new Sample("Bob",25));
        sample.add(new Sample("Jhon",40));

//初期
        System.out.println(sample);

        //年齢でソート
        sample.sort(Comparator.comparing(Sample::getAge));//昇順
        System.out.println(sample);

        sample.sort(Comparator.comparing(Sample::getAge,Comparator.reverseOrder()));//降順
        System.out.println(sample);

        sample.sort(Comparator.comparing(Sample::getName));
        System.out.println(sample);

        sample.sort(Comparator.comparing(Sample::getName,Comparator.reverseOrder()));
        System.out.println(sample);
    }
}
