package objectSample.interfaceSample;


class French implements IfHello {
        private String name;
        public French(String name){
            this.name = name;
        }
    @Override
    public void hello(){
        System.out.println("Bonjour, je m'appelle" + name);
    }
}
