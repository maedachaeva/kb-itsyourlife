package java_09_basic.ch13.sec02.exam02;

// rent()는 Car 클래스 인스턴스를 리턴
public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent() {
        return new Car();
    }
}
