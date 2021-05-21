package ex.ex8;

class IfGetAreaSample {
    public static void main(String[] args) {
        IfGetArea[] figures = {
                new Rectangle(10,10),
                new Circle(10),
                new Triangle(10,10)
        };

        for (IfGetArea figure:figures) {
            System.out.println(figure);
        }
    }
}