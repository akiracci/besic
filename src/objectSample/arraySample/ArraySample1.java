package objectSample.arraySample;

import java.util.Arrays;



class ArraySample1 {
    //配列を引数としたstaticメソッド　②合計を求めるメソッド
    private static  int sum(int[] array){
        int sum =0;
        for (int value:array){
            sum += value;
        }
    return sum;
    }

    //配列のサンプル　配列を初期化する方法の三つ
    public static void main(String[] args) {
        //配列の宣言①
        int[] array1 = new int[10];//サイズ（配列の数）を指定
        int[] array2 = {1,2,3,4,5};//初期値を指定
        int[] array3 = new int[]{10,9,8,7,6};//new宣言と初期値を指定

        //①
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(array1);//Arrays.toString()で記載してないなので正しく表示されない
        System.out.println(array1.length);//10 配列の長さ

    //②配列を引数に記述する場合
        System.out.println(ArraySample1.sum(array2));
        System.out.println(ArraySample1.sum(new int[]{10,20,30}));
    }
}
