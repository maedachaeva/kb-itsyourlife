package java_07_advanced.ch11.sec06;

public class Account {
    private long balance;

    public Account () {
    }

    public long getBalance () {
        return balance;
    }

    public void deposit (int money) {
        balance += money;
    }

    public void withdraw (int money) throws InsufficientException {
        if (balance < money) {
            throw new InsufficientException("잔고가 부족합니다.");
        }
        balance -= money;
    }
}
