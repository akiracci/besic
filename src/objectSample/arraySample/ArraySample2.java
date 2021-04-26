package objectSample.arraySample;

import java.util.Arrays;

//配列と代入と参照
public class ArraySample2 {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,5,9,13};

        //インデックスを使って代入
        array[5] = 8;//上書きになる 変数arrayの配列id５番目の値を８置き換えてる（配列のidは０～始まる）
        int value = array[6];//変数arrayの配列id6番の値を取り出してvalueに代入してる
        System.out.println(Arrays.toString(array));//変数arrayの配列を表示
        System.out.println(value);//変数valueの値arrayを表示
    }
}
