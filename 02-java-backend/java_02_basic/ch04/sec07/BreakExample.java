package java_02_basic.ch04.sec07;

import java.util.Random;

public class BreakExample {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        while (true) {
            int num = random.nextInt(6) + 1;
            System.out.println(num);
            if (num == 6) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
