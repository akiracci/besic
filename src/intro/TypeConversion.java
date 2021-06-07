package intro;

//型変換
public class TypeConversion {
    public static void main(String[] args) {

        //文字列→整数
        Integer num = Integer.valueOf("12345");
        Integer num2 =Integer.parseInt("12345");
        Integer num4 = Integer.valueOf("010101",2);
        System.out.println(num2);
        //文字列→少数
        Double dnum = Double.valueOf("12.34");
        Double dnum2 = Double.parseDouble("12.34");

        //整数→文字列
        Integer num3 = 12345;
        String strnum3 = num3.toString();//"12345"

        //小数→整数
        Double dnum3 = 12.34;
        String strDnum3 = dnum3.toString();//"12.34"
    }
}
