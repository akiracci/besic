package objectSample.arraySample;
import java.util.Arrays;
//配列のサンプル
class ArraySample1_1 {
    //配列を引数としたstaticメソッド
    public static int sum(int[] array){
        int sum = 0;
        for (int value:array) {
            sum += value;
        }
        return sum;
    }
    //配列を引数としたstaticメソッド(引数を可変長引数へ変更)
    public static int sum2(int... array){ //int...で
        int sum = 0;
        for (int value:array) {
            sum += value;
        }
        return sum;
    }
    public static void main(String[] args) {
        //配列の宣言
        int[] array1 = new int[10];//サイズのみ指定
        int[] array2 = {1,2,3,4,5};//初期値も指定
        int[] array3 = new int[] {10,9,8,7,6};//new宣言と初期化
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(array1);//これは正しく表示されない
        System.out.println(array1.length);//10 配列の長さ
        //配列を引数に記述する場合
        System.out.println(ArraySample1_1.sum(array2));//15
        System.out.println(ArraySample1_1.sum(new int[]{10, 20, 30}));
        System.out.println(ArraySample1_1.sum2(10, 20, 30, 40, 50));
    }
}