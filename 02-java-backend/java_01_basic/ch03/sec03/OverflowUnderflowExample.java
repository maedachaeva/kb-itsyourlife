package java_01_basic.ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for (int i = 0; i < 5; i++) {
            var1++;
            System.out.println("var1: " + var1);
        }
        // var1: 126
        // var1: 127
        // var1: -128
        // var1: -127
        // var1: -126

        /** 순환(wrap-around)
         * byte, short, int, long과 같은 정수형은
         * 오버플로우 발생해도 예외가 발생하지 않고 값이 순환(wrap-around)
         * */

        System.out.println("-----------------------");

        byte var2 = -125;
        for (int i = 0; i < 5; i++) {
            var2--;
            System.out.println("var2: " + var2);
        }
        // var2: -126
        // var2: -127
        // var2: -128
        // var2: 127
        // var2: 126
    }
}

