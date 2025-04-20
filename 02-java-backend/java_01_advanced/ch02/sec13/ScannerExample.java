package java_01_advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x 값 입력 : ");
        String inputX = sc.nextLine();
        int x = Integer.parseInt(inputX);

        System.out.print("y 값 입력 : ");
        String inputY = sc.nextLine();
        int y = Integer.parseInt(inputY);

        int result = x + y;
        System.out.println("x + y : " + result);
    }
}
