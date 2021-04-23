package objectSample.equalsSample;

import java.util.Objects;

class Sample2 {
    private String name;
    private int age;

    public Sample2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //サブクラスを同一としない
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sample2 sample2 = (Sample2) o;
        return getAge() == sample2.getAge() && Objects.equals(getName(), sample2.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}