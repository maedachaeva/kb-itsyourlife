package java_03_basic.src.ch06.sec08.exam02;

public class Computer {
    /** 가변 인자
     * : 인자의 개수가 몇 개든 상관없이 배열처럼 처리
     * */
    public static int sum(int... values) {
            int result =  0;
            for (int v : values) {
                result += v;
            }
            return result;
        }
}
