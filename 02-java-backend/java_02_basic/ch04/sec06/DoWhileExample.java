package java_02_basic.ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                메시지를 입력하세요.
                프로그램을 종료하려면 q를 입력하세요.
                """);

        String input;
        do {
            System.out.printf("> ");
            input = sc.nextLine();
            System.out.println(input);

        } while (!input.equals("q"));
        System.out.println("\n프로그램 종료");
    }
}
