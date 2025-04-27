package java_07_basic.ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("[예외] 숫자로 변환할 수 없습니다. " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("[예외] 인덱스 범위를 벗어났습니다. " + e.getMessage());
            }
        }
    }
}
