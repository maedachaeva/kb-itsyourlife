package java_02_advanced.ch03;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        while (run) {
            System.out.print("""
                    ---------------------------------------------
                    1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
                    ---------------------------------------------
                    """);

            System.out.print("선택> ");
            int input = sc.nextInt();

            if (input == 1) {
                System.out.print("학생수> ");
                studentNum = sc.nextInt();
                scores = new int[studentNum];
            } else if (input == 2) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]> ");
                    scores[i] = sc.nextInt();
                }
            } else if (input == 3) {
                for(int i = 0; i < scores.length; i++) {
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
            } else if (input == 4) {
                int max = 0;
                int sum = 0;
                for (int i = 0; i < scores.length; i++) {
                    max = (max < scores[i]) ? scores[i] : max;
                    sum += scores[i];
                }
                double avg = (double) sum / studentNum;

                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            } else if (input == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
