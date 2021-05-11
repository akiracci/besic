package objectSample.enumSample;

public class EnumSample {
    //三色のどれかを判断して表示する
    private static void viewColor(Color color){
        switch (color){
            case RED:
                System.out.println("赤");
                break;
            case BLUE:
                System.out.println("青");
                break;
            case YELLOW:
                System.out.println("黄");
                break;
        }
    }
    public static void main(String[] args) {
        //列記型を表示してみる
        System.out.println(Color.RED);
        viewColor(Color.YELLOW);
        System.out.println(Color.BLUE.getJpName());
        System.out.println(Color.RED.name());
        System.out.println(Color.BLUE.ordinal());
        Color color =Color.valueOf("YELLOW");//列挙型の所得　変数入れなおし
        System.out.println(color.getJpName());//黄色
        Color[] colors = Color.values();//列挙定数の一覧の取得
        for (Color c : colors){
            System.out.println(c);
        }
    }
}
