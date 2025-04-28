package java_07_advanced.ch11.sec06;

public class InsufficientException extends Exception {
    // 커스텀 예외 - 잔액이 부족할 때
    public InsufficientException() {
    }

    public InsufficientException (String message) {
        super(message);
    }
}
