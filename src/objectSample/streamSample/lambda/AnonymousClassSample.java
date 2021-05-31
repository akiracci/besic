package objectSample.streamSample.lambda;


//Runnable　runしかメソッドを持たないクラス。　Runnableを使う＝runを使う
//runは空のメソッド。オーバーローして使うのが前提。
public class AnonymousClassSample {
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        runner.run();//"Hello"
    }

}
