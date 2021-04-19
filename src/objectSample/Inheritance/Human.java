package objectSample.Inheritance;


class Human {
    protected String name;

    public Human(String name){
        this.name = name;
    }

    public void hello(){
        System.out.println("Hello my name is " + name + ".");
    }
}
