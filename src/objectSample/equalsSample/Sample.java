package objectSample.equalsSample;

import java.util.Objects;

class Sample {
    private String keyword;

    public Sample(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//オブジェクトが同一である
        if (!(o instanceof Sample)) return false;//クラスが異なるので不一致
        Sample sample = (Sample) o;//クラスが一致しているので型変換
        //型変換ののちObjectsクラスのequalsメソッドで比較する
        return Objects.equals(getKeyword(), sample.getKeyword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKeyword());
    }
}