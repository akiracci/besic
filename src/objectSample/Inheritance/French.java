package objectSample.Inheritance;

class French extends Human{
    //フィールドnameは継承されているので存在する

    public French(String name){
        super(name);//super()スーパークラスのコンストラクタ
    }
    @Override
    public void hello(){
        System.out.println("Bonjour, je m'appelle" + name);
    }
}