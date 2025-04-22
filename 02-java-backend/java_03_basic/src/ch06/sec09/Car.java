package java_03_basic.src.ch06.sec09;

public class Car {
    // model 필드는 생성자로 초기화
    // speed 필드의 getter/setter 메서드 정의
    // run() 메서드 호출 시 다음과 같이 출력

    //필드 선언
    String model;
    int speed;

    // 생성자
    Car(String model) {
        this.model = model;
    }

    // setter 메서드
    void setSpeed(int speed) {
        this.speed = speed;
    }

    // getter 정의
    int getSpeed() {
        return speed;
    }

    void run() {
        this.setSpeed(130);
        System.out.println(this.model + "가 달립니다.(시속: " + getSpeed() + "km/h)");
    }
}
