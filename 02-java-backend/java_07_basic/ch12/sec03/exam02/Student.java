package java_07_basic.ch12.sec03.exam02;

// 다음 조건을 만족하는 Student 클래스를 정의하세요.
//  - 멤버 필드를 초기화하는 생성자
//  - 멤버 필드에 대한 Getter/Setter 메서드

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
