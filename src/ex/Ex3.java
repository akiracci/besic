package ex;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        int sum = 0; //合計の初期化
        for (int i = 0; i < array.length; i++){
            sum += array[i]; //配列の内容を合計に加算
        }


        System.out.println(sum);//合計の出力
    }
}
