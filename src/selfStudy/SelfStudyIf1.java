package selfStudy;


//武将の攻撃力が8800000以上なら★９討伐確率100%を表示
public class SelfStudyIf1 {


    public static void main(String[] args) {

        int bushou = 9100000;

        if (bushou >= 8800000) {
            System.out.println("攻撃力"+ bushou + "[討伐成功確率１００％]");
        } else {
            System.out.println("攻撃力" + bushou + "[討伐失敗]");
        }
}
}
