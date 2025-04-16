package java_01_basic.ch03.sec04;

public class AccuracyExample1 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = apple - number*pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result); // 0.29999999999999993

        // 이렇게 하면 된다
        System.out.printf("사과 1개에서 남은 양: %.1f\n", result); // 0.3

        /**
         * 컴퓨터는 소수를 이진수로 정확하게 표현할 수 없어서
         * 무한 반복되는 2진수로 저장되기 때문에 근사값만 저장된다.(0.299999999..)
         * */
    }
}
