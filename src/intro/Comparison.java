package intro;

//比較の違い
public class Comparison {
    public static void main(String[] args) {


        //基本比較
        int x = 10, y = 10;
        System.out.println(x==y);

        //参照の比較
        Integer ix = new Integer(10);
        Integer iy = new Integer(10);
        System.out.println(ix==iy);
        System.out.println(ix.equals(iy));
    }
}
