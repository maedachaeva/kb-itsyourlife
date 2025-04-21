package java_04_basic.ch07.sec08.exam01;

/**
 * [Car 클래스]
 * Tire를 멤버 변수로 가지고 있음 → "Car has-a Tire" 관계
 * 어떤 종류의 타이어든 장착할 수 있도록 부모 타입으로 선언 (다형성)
 */
public class Car {
    public Tire tire; // 부모 타입으로 선언해서 여러 타이어 장착 가능

    public void run() {
        tire.roll(); // 실제 타이어 객체에 따라 오버라이딩된 roll()이 실행됨
    }
}
