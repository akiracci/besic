package Ex;

public class Ex2 {
    public static void main(String[] args) {
        int weight = 68;
        double height = 172;

        System.out.println("身長 " + height + "cm");
        System.out.println("体重 " + weight + "kg");
        height /= 100;
        System.out.println("BMI " + weight/(height*height) );
        System.out.println("適正体重　" + (height*height*22));
    }
}
