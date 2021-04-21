package objectSample.abstractSample;

class Japanese extends Human {
    //フィールドnameは継承されているので存在する

    public Japanese(String name){
        super(name);//super()スーパークラスのコンストラクタ
    }


    @Override
    public void hello(){
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }
}
