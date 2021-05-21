package ex.ex8;

class Triangle implements IfGetArea {
    private double base;//底辺
    private double height;//高さ

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2.0;
    }

    @Override
    public String toString() {
        return String.format("三角形 底辺:%.2f 高さ:%.2f 面積:%.2f",
                base,height,getArea());
    }
}
