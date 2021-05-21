package ex.ex7;

//図形の実行クラス
class FigureSample {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(10,10),
                //new Circle(10),
                //new Triangle(10,10)
        };

        for (Figure figure:figures) {
            System.out.println(figure);
        }
    }
}