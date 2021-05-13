package intro;

public class If2 {
    public static void main(String[] args) {
        //0以上かつ100以下
        int num = 101;
        if (num>=0){
            if (num<=100){
                System.out.println(num + "は範囲内");
            }
            else{
                System.out.println(num +"は範囲外");
            }
        }
        else {
                System.out.println(num + "は範囲外");
        }
        //論理演算子を用いる
        if (num>=0 && num<=100){
                System.out.println(num + "は範囲内");
            } else {
                System.out.println(num + "は範囲外");
            }
    }
}
