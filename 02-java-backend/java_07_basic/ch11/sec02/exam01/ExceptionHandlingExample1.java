package java_07_basic.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    // 기존 코드
    /*public static void printLength(String data) {
        int result = data.length(); // 따라서 NullPointerException 발생
        System.out.println("문자 수: " + result);
    }*/

    // 예외 처리 코드 추가
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (Exception e) {
            System.out.println("[에러 메세지] " + e.getMessage()); // 예외 객체의 메시지로 출력
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // null은 length를 구할 수 없음
        System.out.println("[프로그램 종료]");
    }

    // 1. 다음 프로그램의 문제점을 설명하고, 그 결과를 확인하세요.
    //  => data가 null 값인데 length를 구하려 해서 NullPointerException이 발생

    // 2. 앞의 프로그램에 예외 처리 코드를 추가하세요.
    //  => 예외 처리시 출력할 메시지
    //      - 예외 객체의 메시지로 출력
    //      - 스택 추적 내용을 모두 출력
}
