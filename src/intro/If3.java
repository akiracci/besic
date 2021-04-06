package intro;

//分岐命令　if その３
public class If3 {
    public static void main(String[] args) {
        //多分岐
        //80点以上をA、７０点～７９点をB、６０点～69点をC、その他をD
        int score = 65;

        if (score>=80){
            System.out.println(score + ":A");
        }else if (score>=70){
            System.out.println(score +":B");
        }else if(score>=60){
            System.out.println(score + ":C");
        }else {
            System.out.println(score +":D");
        }
    }
}
