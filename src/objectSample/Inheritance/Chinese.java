package objectSample.Inheritance;

    class Chinese extends Human{
        //フィールドnameは継承されているので存在する

        public Chinese(String name){
            super(name);//super()スーパークラスのコンストラクタ
        }
        @Override
        public void hello(){
            System.out.println("你好，我叫芋頭" + name + "です。");
        }
    }

