package java_02_basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = 0;

        while (true) {
            System.out.printf("""
                    -----------------------------
                    1. 증속 | 2. 감속 | 3. 중지
                    -----------------------------
                    """);

            System.out.printf("선택: ");
            int input = Integer.parseInt(sc.nextLine());

            if (input == 1) { // 증속
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if (input == 2) { // 감속
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else {
                System.out.println("프로그램 종료1");
                break;
            }
        }
    }
}
