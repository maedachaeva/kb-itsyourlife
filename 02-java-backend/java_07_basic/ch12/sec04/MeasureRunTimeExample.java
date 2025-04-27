package java_07_basic.ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        // 1부터 1000000까지의 합을 구하고 계산 결과와 계산에 소요된 시간을 nano초 단위로 출력

        long startTime = System.nanoTime();

        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }

        long endTime = System.nanoTime();

        System.out.println("계산 결과 : " + sum);
        System.out.println("소요 시간(nano) : " + (endTime - startTime));
    }
}
