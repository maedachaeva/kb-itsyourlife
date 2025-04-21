package java_02_advanced.ch01;

public class FindSolution {
    public static void main(String[] args) {
        // 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서
        // (x, y) 형태로 출력하는 코드를 작성하세요.
        // 단, x와 y는 10이하의 자연수 입니다

        for (int x = 1 ; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                int result = 4 * x + 5 * y;
                if (result == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}
