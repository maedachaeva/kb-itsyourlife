package java_02_basic.ch05.sec06;

import java.util.Arrays;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        // 정수 요소 3개를 가지는 정수 배열 arr1을
        // 선언 및 생성하고(초기화하지 않음) 그 arr1 배열의 내용을 출력
        int[] arr1 = new int[3];
        System.out.println(Arrays.toString(arr1));

        // 문자열 요소 3개를 가지는 문자열 배열 arr2를
        // 선언 및 생성하고(초기화하지 않음) 그 arr1 배열의 내용을 출력
        String[] arr2 = new String[3];
        System.out.println(Arrays.toString(arr2));
    }
}
