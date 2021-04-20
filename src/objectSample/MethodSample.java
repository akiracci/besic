package objectSample;


//メソッドの記述
class MethodLib {
    /**
     * 整数を２つ加算するメソッド
     * @param x 整数1 int
     * @param y 整数2 int
     * @return 整数1 + 整数2 int
     */
  public static int plus(int x,int y){
      return x + y;
  }
public static double ave(double[] array){
      double ave = 0.0;
      double sum = 0.0;
      for(double value:array) {
          sum += value;
      }
    return ave;
}
}
class MethodSample {
    public static void main(String[] args) {
        int answer = MethodLib.plus(20, 30);
        System.out.println(answer);
        double[] array = {1, 2, 3, 4, 5};
        System.out.println(MethodLib.ave(array));

    }
}
//引数：代入される変数
//static メソッドの宣言
//return