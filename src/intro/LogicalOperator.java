package intro;

//論理演算子
public class LogicalOperator {
    public static void main(String[] args) {
        boolean t = true, f = false;

        //理論積(AND)
        System.out.println("論理値（AND）両方がtrueならtrueを表示");
        System.out.println("f && f " + (f && f));//false
        System.out.println("t && f " + (t && f));//false
        System.out.println("f && t " + (f && t));//false
        System.out.println("t && t " + (t && t));//true

        //論理和(OR)
        System.out.println("論理和（OR）どちらかがtrueならtrueを表示");
        System.out.println("f || f " + (f || f));//false
        System.out.println("t || f " + (t || f));//true
        System.out.println("f || t " + (f || t));//true
        System.out.println("t || t " + (t || t));//true

        //否定(NOT)
        System.out.println("否定(NOT) trueとfalseを逆にする");
        System.out.println("!f " + (!f));
        System.out.println("!t " + (!t));

        //演算結果は？
        System.out.println("false || !true && true" + " :" +(false || !true && true));
        System.out.println("↑　！否定＞&&論理積＞||論理和の順で実行される");

        //0以上かつ100以下
        int x = 100;
        System.out.println(x >= 0 && x <= 100);
        //0未満もしくは100越える
        System.out.println(x < 0 || x >100);
    }
}
