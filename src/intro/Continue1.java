package intro;

public class Continue1 {
    public static void main(String[] args) {
        int[] array = {1,2,-3,4,5};

        //負の整数を発見したらスキップする
        for (int value:array){
            if (value<0) continue;//負の数の時はスキップする
            System.out.println(value);//中断するまで処理を出力し表示する
        }
    }
}
