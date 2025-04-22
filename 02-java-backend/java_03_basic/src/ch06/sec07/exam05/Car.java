package java_03_basic.src.ch06.sec07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    /** 'this.' vs 'this()'
     * this.
     *  : 현재 객체의 필드(속성)
     *
     * this()
     *  : 같은 클래스의 다른 생성자를 호출
     *    생성자의 첫 줄에 위치해야 함
     * */

    Car() {
    }

    Car(String model) {
        this(model, "검정", 100); // 이 this는 맨 아래 생성자를 호출한다.
    }

    Car(String model, String color) {
        this(model, color, 100);
    }

    // 이 생성자가 초기화 역할을 함
    // 중복되는 초기화 코드를 생성자 하나에 담는다.
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
