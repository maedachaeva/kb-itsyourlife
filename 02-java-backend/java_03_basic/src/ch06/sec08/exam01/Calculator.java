package java_03_basic.src.ch06.sec08.exam01;

public class Calculator {
    public static void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    public static int plus(int x, int y) {
        int plusResult = x + y;
        return plusResult;
    }

    public static double divide(int x, int y) {
        double divideResult = (double)x / (double)y;
        return divideResult;
    }

    public static void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}
