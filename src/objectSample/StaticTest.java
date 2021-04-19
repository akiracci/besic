package objectSample;

//staticのまとめ
class StaticTest {
    //staticField
    static String staticField = "school";

    //staticMethod
    static String staticMethod() {
        return "wars";
    }

    static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    static int min(int x, int y) {
        return x < y ? x : y;
    }
}
