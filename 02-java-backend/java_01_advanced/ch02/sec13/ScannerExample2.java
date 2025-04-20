package java_01_advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력에 q가 들어올 때까지
        // 입력 문자열 :
        // 출력 문자열 :

        while (true) {

            System.out.print("입력 문자열 : ");
            String input = sc.nextLine();

            if (input.equals("q")) break;

            System.out.println("출력 문자열 : " + input + "\n");
        }
        System.out.println("종료");
    }
}
