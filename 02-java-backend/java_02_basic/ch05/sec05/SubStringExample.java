package java_02_basic.ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);

        // 이게 아니라 substring 문제였음
        /*String[] splitedSsn = ssn.split("-");

        String firstNum = splitedSsn[0];
        System.out.println(firstNum);

        String secondNum = splitedSsn[1];
        System.out.println(secondNum);*/
    }
}
