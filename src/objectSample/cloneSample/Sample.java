package objectSample.cloneSample;

//クローンメソッドの実装
class Sample implements Cloneable {
    private int num;//基本型
    private Node node;//参照型


    //防衛的コピー？↓
    public Sample(int num, Node node) {
        this.num = num;
        this.node = new Node(node);//ポインタの参照を断ち切るため
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "num=" + num +
                ", node=" + node +
                '}';
    }

    @Override
    public Sample clone() {
        Sample clone = null;
        try {
            //オブジェクトクラスのクローンメソッドで複製する
            clone = (Sample) super.clone();
            //参照型のフィールドを個別に複製する
            clone.node = node.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();//例外時のトレース
        }
        return clone;//複製を返却する
    }
}