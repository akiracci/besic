package objectSample.arraySample;

import java.util.Arrays;


//配列の
//https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Arrays.html
public class ArraySample3 {
    public static void main(String[] args) {



    //配列のコピー
    int[] array = {1, 2, 3, 4, 5};//配列の値を設定
    int[] newArray1 = Arrays.copyOf(array, array.length);//Arrays.copyOfでコピーメッソド　(array,変数名　.lengthで値の取り出し）
    int[] newArray2 = Arrays.copyOf(array,3);
    int[] newArray3 = Arrays.copyOf(array,10);
        System.out.println(Arrays.toString(newArray1));
        System.out.println(Arrays.toString(newArray2));
        System.out.println(Arrays.toString(newArray3));

        int[] newArray4 = Arrays.copyOfRange(array,1,3);//{2,3}が表示 id1~3までid３は表示されない
        System.out.println(Arrays.toString(newArray4));
        System.out.println();
        System.out.println(array);//適正に表示されない
    }
}
