package java_04_basic.ch07.sec08.exam01;

/**
 * [CarExample]
 * 다양한 타이어를 Car에 장착해 보고, roll()이 각각 다르게 동작하는지 확인
 */
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Tire 객체 장착
        myCar.tire = new Tire();
        myCar.run(); // 회전합니다.

        // HankookTire 객체 장착
        myCar.tire = new HankookTire();
        myCar.run(); // 한국 타이어가 회전합니다.

        // KumhoTire 객체 장착
        myCar.tire = new KumhoTire();
        myCar.run(); // 금호 타이어가 회전합니다.
    }
}
