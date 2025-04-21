package java_02_basic.ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = 9;
        /**
         * [현재시간: 9 시]
         * 회의를 합니다.
         * 업무를 봅니다. // break가 없어서 쭉 출력
         * 외근을 나갑니다.
         * */
        System.out.println("[현재시간: " + time + " 시]");

        switch (time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
