package java_05_basic.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare(); // Vehicle에는 checkFare가 없음

        Bus bus = (Bus) vehicle; // 강제형변환 하면
        bus.run();
        bus.checkFare(); // checkFare 호출 가능
    }
}
