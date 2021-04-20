package objectSample.interfaceSample;


class Chinese implements IfHello {
    private String name;
    public Chinese(String name){
        this.name = name;
    }

        @Override
        public void hello(){
            System.out.println("你好，我叫芋頭" + name + "です。");
        }
    }

