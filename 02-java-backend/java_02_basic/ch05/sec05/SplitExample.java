package java_02_basic.ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        String[] splitedBoard = board.split(",");

        System.out.println("번호: " + splitedBoard[0]);
        System.out.println("제목: " + splitedBoard[1]);
        System.out.println("내용: " + splitedBoard[2]);
        System.out.println("성명: " + splitedBoard[3] + "\n");

        for (String value : splitedBoard) {
            System.out.println(value);
        }

        /*for (int i = 0; i < splitedBoard.length; i++) {
            System.out.println(splitedBoard[i]);
        }*/
    }
}
