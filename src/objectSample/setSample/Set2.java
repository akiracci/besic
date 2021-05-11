package objectSample.setSample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();//順序どおり格納する
        Set<Integer> treeSet = new TreeSet<>();//二分探索木　ソトーしながら追加　昇順　並び替えできる

        for (int i = 100; i>0; i-=3){
            hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
        }
        System.out.println("HashSet " + hashSet);
        System.out.println("LinkedHashSet " + linkedHashSet);
        System.out.println("TreeSet " + treeSet);
    }
}
