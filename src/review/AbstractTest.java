package review;

abstract class AbstractTest {
    protected String name;

    public AbstractTest(String name) {

        this.name = name;
    }

    public abstract String getName();
}
