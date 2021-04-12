package intro;

import java.util.Scanner;

//whileのサンプル３
public class whille3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("パスワードを入力してください");
        String str = in.nextLine();

        while (!"abc".equals(str)){
            System.out.println("パスワードが違います");
            str = in.nextLine();
        }
        System.out.println("OK");
    }
}
