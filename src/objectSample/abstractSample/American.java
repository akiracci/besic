package objectSample.abstractSample;

class American extends Human {
    //フィールドnameは継承されているので存在する

    public American(String name){
        super(name);//super()スーパークラスのコンストラクタ
    }
    @Override
        public void hello(){
            System.out.println("Hello my name is " + name + ".");
        }
}
