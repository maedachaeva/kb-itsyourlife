package java_02_basic.ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        // 1. IndexOf()를 이용하여 "프로그래밍" 단어가 있는 위치를 출력
        // 2. 자바와 관련된 책인지 판단

        System.out.println(subject.indexOf("프로그래밍"));

        if (subject.indexOf("자바") != -1) { // indexOf는 주어진 문자열이 없으면 -1을 리턴
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
    }
}
