package ex;

//該当するデータの個数をカウントする
public class Ex6 {
    public static void main(String[] args) {
        int[] array = {89,102,300,50,0};

        //100以上のデータの数を数える
        int cnt = 0;

        for (int value:array) {
            if (value >= 100) cnt++;
        }
        System.out.println("100以上のデータの個数:" + cnt);
    }
}
