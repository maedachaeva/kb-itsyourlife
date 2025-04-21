package java_02_advanced.ch03;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        boolean run = true;

        while (run) {
            System.out.print("""
                    -----------------------------
                    1.예금 | 2.출금 | 3.잔고 | 4.종료
                    -----------------------------
                    """);

            System.out.print("선택> ");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.print("예금액> ");
                    balance += sc.nextInt();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("출금액> ");
                    balance -= sc.nextInt();
                    System.out.println();
                    break;
                case 3:
                    System.out.print("잔고> ");
                    System.out.println(balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
        System.out.print("\n프로그램 종료");
    }
}
