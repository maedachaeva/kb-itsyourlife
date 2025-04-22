package java_03_basic.src.ch06.sec07.exam04;

public class Car {
    /**
     * Q. 다음을 만족하는 생성자를 추가하세요.
     * 매개변수가 없는 생성자(디폴트 생성자)
     * 매개변수로 model만 가지는 생성자
     * 매개변수로 model과 color를 가지는 생성자
     * 매개변수로 model, color, maxSpeed를 가지는 생성자
     */

    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자 추가
    Car() {
    }

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
