package selfStudy.returnSample;

//returnを試す。
public class ReturnSample1 {
    public static int add(int x , int y){//addメソッドをつくり(int型xとint型yの仮引数を策定した。
        int anss = x + y; //int型の変数anssにx+yの計算を代入した
        return anss; //return文で変数anssを戻り値とした。　戻り値は呼び出し元のmainメソッドでは値を呼ばなくても良いようだ。
    }

    public static void main(String[] args) {
        int ans = add(100,10);//add();メソッドを呼び出して実引数としてxに100とyに10を入力して変数ansに代入した。
        System.out.println("100 + 10 = " + ans);//100 + 10 = 110と表示された
        System.out.println("100 + 10 = " + add(20,10));//System.out.printlnに直接メソッドを呼ぶこともできる。



    }
}
