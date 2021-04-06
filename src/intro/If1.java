package intro;

import java.time.LocalDateTime;
import java.util.Random;

public class If1 {
    public static void main(String[] args) {
        //奇遇判定
        //Randomがクラス　Randomでクラスの宣言をして　random変数名に　randomのクラスの処理を格納する　　Random(LocalDateTime.now().getSecond())で処理をつくる
        Random random = new Random(LocalDateTime.now().getSecond());
        int num = random.nextInt(100);
        if (num%2 == 0){
            //偶数
            System.out.println(num + "は偶数です");
        } else {
            //奇数
            System.out.println(num + "は奇数です");
        }

    }
}
