package objectSample.arraySample;

import java.util.Arrays;

//配列のソート　並び替え
class ArraySample4 {
    public static void main(String[] args) {
        int[] array = {50,20,40,30,10};
        System.out.println("整列前" + Arrays.toString(array));
        Arrays.sort(array);//Arrays.sortで　変数arrayの並び替えをしてる
        System.out.println("整列後" + Arrays.toString(array));
    }
}
