package review;

class TestA {
    public void methodA() {
        System.out.println("A");
    }
}

class TestB extends TestA {
    public void methodB() {
        System.out.println("B");
    }
}

class Cast {
    public static void main(String[] args) {
        TestB tb1 = new TestB();
        TestA ta1 = tb1;

        //tbは両方のメソッドが使える
        ta1.methodA();
        tb1.methodA();
        tb1.methodB();

        TestA ta2 = new TestA();
        TestB tb2 = (TestB) ta2;
        ta2.methodA();
        ((TestB) ta2).methodB();
        tb2.methodA();
        tb2.methodB();

    }

}
