package java_04_basic.ch07.sec07.exam03;

/**
 * Parent 타입의 참조 변수로는 부모 클래스에 선언된 필드와 메서드만 사용할 수 있다.
 *
 * 자식 클래스에서 새롭게 정의한 필드나 메서드는 업캐스팅된 상태에서는 사용할 수 없고,
 * 반드시 다운캐스팅을 통해 자식 타입으로 형변환한 뒤에만 접근할 수 있다.
 * */
public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child(); // 업캐스팅 가능

        // Parent 타입으로 필드와 메서드 사용
        parent.field1 = "data1"; // 부모 필드 접근 가능
        // data1은 부모 클래스에 정의된 필드인 field1에 접근하고 값을 넣을 수 있다는 걸 보여주는 예시 값
        parent.method1(); // 부모 메서드 호출 가능
        parent.method2(); // 부모 메서드 호출 가능

        // 업캐스팅 상태에서는 자식 멤버에 접근할 수 없음
        /*parent.field2 = "data2";
        parent.method3();*/

        // 자식 클래스 멤버 사용 ==> 다운캐스팅 후에 가능
        // 다운캐스팅: 자식 타입으로 강제 형변환
        Child child = (Child) parent;

        // Child 타입으로 필드와 메소드 사용
        child.field2 = "data2"; // 자식 필드 접근 가능
        child.method3(); // 자식 메서드 호출 가능
    }
}

/** ✅ 다운캐스팅 정리
 *
 *  1. 정의
 *    - 다운캐스팅이란: 업캐스팅된 객체를 다시 원래 자식 타입으로 되돌리는 것
 *
 *  2. 사용 목적
 *    - 업캐스팅 상태에서는 부모 클래스에 정의된 멤버만 사용할 수 있기 때문에,
 *    - 자식 클래스의 고유한 필드나 메서드를 사용하려면 다운캐스팅이 필요함.
 *
 *  3. 조건
 *    - 다운캐스팅은 실제 객체가 자식 타입일 경우에만 유효함.
 *    - 그렇지 않으면 ClassCastException 예외 발생
 *
 *  4. 주의
 *    - 업캐스팅 없이 단독으로 다운캐스팅은 의미 없음
 *    - 다운캐스팅은 반드시 업캐스팅이 선행된 객체에만 사용 가능
 * */
