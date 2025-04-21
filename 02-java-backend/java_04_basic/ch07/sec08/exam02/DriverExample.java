package java_04_basic.ch07.sec08.exam02;

// p321
// 다형성 + 동적 바인딩
public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus); // Bus는 Vehicle이므로 업캐스팅

        Taxi taxi = new Taxi();
        driver.drive(taxi);
        // 매개변수는 Vehicle 타입이지만 실제로 넘긴 객체의 오버라이딩된 run()
    }

}
