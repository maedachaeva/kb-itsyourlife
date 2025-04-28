package java_07_advanced.ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        /**
         * 난수 추출은 Random 클래스를 이용
         * 1~45 범위의 랜덤한 숫자 6개 선택한 후 출력(선택한 번호)
         * 1~45 범위의 랜덤한 숫자 6개 선택한 후 출력(당첨 번호)
         * 두 숫자 그룹을 각각 정렬
         * 두 그룹 내용의 동일 여부에 따라 1등 당첨여부를 출력하세요.
         * */

        // 선택한 번호
        int[] selectNumber = new int[6];
        Random random = new Random();

        System.out.print("선택한 번호: ");

        for (int i = 0; i < 6; i++) {
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print(selectNumber[i] + " ");
        }
        System.out.println();

        // 당첨 번호
        int[] winningNumber = new int[6];
        random = new Random();

        System.out.print("당첨 번호: ");

        for (int i = 0; i < 6; i++) {
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.print(winningNumber[i] + " ");
        }
        System.out.println();

        // 두 숫자 그룹을 각각 정렬
        Arrays.sort(selectNumber);
        Arrays.sort(winningNumber);

        // 1등 당첨 여부
        boolean result = Arrays.equals(selectNumber, winningNumber);
        System.out.print("당첨 여부: ");

        if(result) {
            System.out.println("1등 당첨");
        } else {
            System.out.println("미당첨");
        }
    }
}
