package objectSample.streamSample.lambda;


import java.util.function.Predicate;

//https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/function/Predicate.html
//Predicate インターフェース型
public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = i -> i >=60;
        Predicate<String> predicate2 = s -> s.length() >=3;

        //Predicate.testメソッドtrueかfalseで返す。ifの代替
        System.out.println(predicate1.test(80));
        System.out.println(predicate2.test("ab"));
    }
}
