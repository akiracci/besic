package review;

class TestC extends AbstractTest {
    public TestC(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
