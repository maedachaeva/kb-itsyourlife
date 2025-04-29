package java_09_basic.ch13.sec02.exam01;

public class Product<K, M> {
    private K kind; // 멤버 변수는 private으로 만드는 게 객체지향의 기본 원칙
    private M model;

    public K getKind() {
        return this.kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return this.model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
