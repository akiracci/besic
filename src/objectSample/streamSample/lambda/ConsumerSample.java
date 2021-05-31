package objectSample.streamSample.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        //Consumer型インターフェースのlambda（ラムダ）式
        Consumer<String> consumer1 = s -> System.out.println(s + "です");
        Consumer<Integer> consumer2 = i -> integerList.add(i);

        consumer1.accept("これは猫");
        System.out.println();
        consumer2.accept(100);
        consumer2.accept(10);

        integerList.stream().forEach(System.out::println);
        System.out.println();
    }

}
