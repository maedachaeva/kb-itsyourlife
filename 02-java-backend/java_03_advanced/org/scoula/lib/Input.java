package java_03_advanced.org.scoula.lib;

import java.util.Scanner;

public class Input {
    // 멤버 변수로 Scanner 객체에 대한 정적 참조 변수를 가지며, 바로 초기화 함
    static Scanner sc = new Scanner(System.in);

    // 문자열 입력
    public static String read(String title) {
        System.out.print(title);
        return sc.nextLine();
    }

    public static String read(String title, String defaultValue) {
        System.out.printf("%s(%s): ", title, defaultValue);
        String answer = sc.nextLine();

        return answer.isEmpty() ? defaultValue : answer;
    }

    // 정수 입력
    public static int readInt(String title) {
        System.out.print(title);
        int answer = sc.nextInt();
        sc.nextLine(); // 엔터 제거
        return answer;
    }

    // yes/no 확인
    public static boolean confirm(String title, boolean defaultValue) {
        String yesNo = defaultValue ? "(Y/n)" : "(y/N)";
        System.out.printf("%s %s: ", title, yesNo);

        String answer = sc.nextLine();
        if (answer.isEmpty())
            return defaultValue;

        return answer.equalsIgnoreCase("y");
    }

    public static boolean confirm(String title) {
        return confirm(title, true);
    }
}