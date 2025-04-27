package java_07_basic.ch11.sec03.exam01;

// 다음 프로그램에 다중 예외 처리 코드를 추가하세요.
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        try {
            for (int i = 0; i <= array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }
        } catch (NumberFormatException e) {
            System.out.println("[예외] 숫자로 변환할 수 없습니다. " + e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[예외] 인덱스 범위를 벗어났습니다. " + e.getMessage());
            e.printStackTrace();
        }
    }
}
