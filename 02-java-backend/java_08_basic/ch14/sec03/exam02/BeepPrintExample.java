package java_08_basic.ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
    public static void main(String[] args) {
        /** 다음에 정의한 두 작업을 각각의 스레드에서 수행하도록 프로그램을 작성하세요.
         * 작업1: 0.5초 간격으로 비프음 출력
         *  - Runnable 인터페이스를 이용하여 작업스레드에서 실행
         * 작업2: 0.5초 간격으로 "띵" 문자열 출력
         *  - Main 스레드에서 실행
         * */

        Thread thread = new Thread(new Runnable() { // 작업 스레드 생성
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                    }
                }
            }
        });

        thread.start(); // 작업 스레드 실행

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
