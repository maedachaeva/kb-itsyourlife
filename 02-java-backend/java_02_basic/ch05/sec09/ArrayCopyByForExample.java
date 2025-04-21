package java_02_basic.ch05.sec09;

import java.util.Arrays;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        // oldIntArray를 newIntArray 배열(요소가 5개임)로 복사하세요.
        // for문을 이용해서 복사함
        // for문을 이용해서 다음과 같이 각 요소를 출력함
        // 1, 2, 3, 0, 0,

        int[] oldIntArray = { 1, 2, 3 };
        int[] newIntArray = new int[5];

        // 복사
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        // 출력
        for (int j = 0; j < newIntArray.length; j++) {
            System.out.printf(newIntArray[j] + ", ");
        }
    }
}
