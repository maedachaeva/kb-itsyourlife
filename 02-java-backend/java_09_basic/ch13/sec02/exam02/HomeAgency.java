package java_09_basic.ch13.sec02.exam02;

// rent()는 Home 클래스 인스턴스를 리턴
public class HomeAgency implements Rentable<Home> {
    @Override
    public Home rent() {
        return new Home(); // → 새로운 Home 객체를 하나 만들어서 리턴하는 것
        // 왜 new로 Home 객체를 생성해서 리턴하는지 의문
        //  → 리턴해야 할 Home이 아직 존재하지 않으니 new로 직접 하나 만들어서 리턴하는 것이다.
    }
}
