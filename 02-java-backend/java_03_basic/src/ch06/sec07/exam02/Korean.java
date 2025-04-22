package java_03_basic.src.ch06.sec07.exam02;

public class Korean {
    // Q. 생성자의 매개변수로 name, ssn 필드를 초기화하는 생성자를 정의하세요.
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    // public 붙이면 다른 패키지에서도 객체를 만들 수 있음
    public Korean(String n, String s) {
        name = n;
        ssn = s;
    }
}
