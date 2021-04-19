package objectSample.Inheritance;

//スーパークラスとサブクラス
class HumanSample2 {
    public static void main(String[] args) {

        //サブクラスはスーパークラスでまとめられる
        Human[] humans = {
                new Human("tom"),
                new Japanese("たけし"),
                new Chinese("李"),
                new French("Gabriel")
        };

        for (Human human:humans){
            human.hello();
        }
    }
}
