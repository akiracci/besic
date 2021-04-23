package objectSample.cloneSample;

class Node implements Cloneable {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    //コンストラクタのオーバーロード
    //引数が異なる同名および同じ戻り値のメソッドを多重定義できる
    public Node(Node node) {
        this.name = node.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Node clone() {
        Node clone = null;
        try {
            clone = (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                '}';
    }
}