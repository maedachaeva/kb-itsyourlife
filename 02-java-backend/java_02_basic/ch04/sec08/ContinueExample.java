package java_02_basic.ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        for (int even = 2; even <= 10; even++) {
            if (even % 2 == 0) {
                System.out.printf(even + " ");
            } else continue;
        }
    }
}
