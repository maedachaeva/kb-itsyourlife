package java_03_basic.src.ch06.sec07.exam03;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean(String name, String ssn) {
        this.name = name; // 지역 변수와 필드 변수명이 동일한 경우 this 붙여주기
        this.ssn = ssn;
        /**
         * this.name = name
         *      ===> 객체의 name 필드에, 생성자 매개변수 name 값을 대입해라
         * this는 지금 생성 중인 그 객체 자신을 가리킨다.
         * */
    }
}
