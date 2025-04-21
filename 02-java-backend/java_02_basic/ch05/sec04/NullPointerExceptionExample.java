package java_02_basic.ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10; // null인 변수에 접근하려 하면 NullPointerException 발생

        String str = null;
        //String str = ""; // null이 아닌 값으로 초기화해야 함
        System.out.println("총 문자 수: " + str.length());
    }
}
