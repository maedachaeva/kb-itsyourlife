package java_01_basic.ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";

        System.out.println(name);
        System.out.println(job);

        System.out.println("""
                나는 \"자바\"를 배웁니다.
                번호\t\t이름\t\t직업
                """);

        System.out.printf("나는\n");
        System.out.printf("자바를\n");
        System.out.printf("배웁니다.");
    }
}
