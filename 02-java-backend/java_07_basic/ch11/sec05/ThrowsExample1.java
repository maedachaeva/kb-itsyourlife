package java_07_basic.ch11.sec05;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("예외 처리: " + e.toString());
            /** e.toString()
             * : 예외 객체(e)의 "클래스 이름 + 예외 메시지"를 문자열로 만들어서 반환하는 메서드
             * [예외 타입]: [예외 메시지] 형태로 문자열이 나온다.
             * */
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("java.lang.String2");
    }
}
