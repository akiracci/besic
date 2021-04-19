package objectSample.abstractSample;


class HumanSample {
    public static void main(String[] args) {

        //サブクラスはスーパークラスでまとめられる
        Human[] humans = {
                new American("Tom"),
                new Japanese("たけし"),
                new Chinese("李"),
                new French("Gabriel")
        };

        for (Human human:humans){
            human.hello();
        }
    }
}
