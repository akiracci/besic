package intro;

//算術演算子
public class ArithmeticOperator {
    public static void main(String[] args) {
        int a = 5,b = 3;
        System.out.println(a + " + " + b + " = " + (a+b));//8
        System.out.println(a + " - " + b + " = " + (a-b));//2
        System.out.println(a + " * " + b + " = " + (a*b));//15
        System.out.println(a + " / " + b + " = " + (a/b));//1
        System.out.println(a + " % " + b + " = " + (a%b));//2

        double c =5,d = 3;
        System.out.println(c + " + " + d + " = " + (c+d));
        System.out.println(c + " - " + d + " = " + (c-d));
        System.out.println(c + " * " + d + " = " + (c*d));
        System.out.println(c + " / " + d + " = " + (c/d));
        System.out.println(c + " % " + d + " = " + (c%d));
        System.out.println(c + d);

    }
}
