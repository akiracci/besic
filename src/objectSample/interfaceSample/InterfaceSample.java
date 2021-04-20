package objectSample.interfaceSample;

//インターフェイス型の利用
class IfHelloSample {
    public static void main(String[] args) {
        //インターフェイスの型になっている点に注意
        IfHello[] humans = {
                //new American("Tom"),
                new Japanese("たけし"),
                new Chinese("李"),
                new French("Gabriel")
        };

        for (IfHello human:humans) {
            human.hello();//hello()の実装が確定しているので書ける
        }
    }
}