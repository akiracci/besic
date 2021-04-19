package objectSample.Inheritance;

//継承のサンプル
class HumanSample {
    public static void main(String[] args) {
        Human human1 = new Human( "Tom");
        human1.hello();//Hello my naem is Tom.
        Japanese japanese1 = new Japanese("たけし");
        japanese1.hello();//こんにちは、わたしの名前はたけしです。
    }
}
