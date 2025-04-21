package java_02_basic.ch04.sec02;

// import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6) + 1;

        // java.util.Random 클래스 사용할 수도 있음
        // Random random = new Random();
        // int num = random.nextInt(6) + 1;

        if (num == 6) {
            System.out.println("6번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println("5번이 나왔습니다.");
        } else if (num == 4) {
            System.out.println("4번이 나왔습니다.");
        } else if (num == 3) {
            System.out.println("3번이 나왔습니다.");
        } else if (num == 2) {
            System.out.println("2번이 나왔습니다.");
        } else {
            System.out.println("1번이 나왔습니다.");
        }
    }
}
