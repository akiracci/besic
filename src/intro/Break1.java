package intro;

//breakのサンプル
public class Break1 {
    public static void main(String[] args) {
        int[] array = {1,2,-3,4,5};

        //負の整数を発見したら中断する
        for (int value:array){
            if (value<0) break;//負の数の時に中断
            System.out.println(value);//中断するまで処理を出力し表示する
        }
    }
}
