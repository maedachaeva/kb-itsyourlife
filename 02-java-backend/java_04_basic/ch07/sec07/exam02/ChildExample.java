package java_04_basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();

        // parent.method3();
        // method3()은 Child 클래스에서만 정의된 자식 고유의 메서드이기 때문에
        // Parent 타입 변수로 접근 불가
        // child.method3()로 가능
    }
}
