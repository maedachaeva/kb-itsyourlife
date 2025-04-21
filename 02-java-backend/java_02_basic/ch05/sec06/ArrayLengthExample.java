package java_02_basic.ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {84, 90, 96};

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double avg = (double) sum / scores.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
