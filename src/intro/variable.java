package intro;

public class variable {
    public static void main(String[] args) {
        //整数型
        byte b = 10;
        short s = 32000;
        int i = 100;
        long l = 10000;
        //↑　例）　byte b = 10;より　イコール（=）は代入。　イコールの右の値を左に入れる。　「byte変数bに10を代入する。」
        //ここではbが変数で同一ブロック{}内では同じ変数は使えない。

        //↓浮動小数点型　
        float f = 12.34f;
        double d = 123.456;
        //float dobleは末尾にfないしdを入れることも可能

        //文字列
        char c1 ='A';
        char c2 ='\u0065';//Unicodeで記載することもできる

        //真偽値型
        boolean bool = true;//true or false　しか記載できない。

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(bool);
    }
    }

