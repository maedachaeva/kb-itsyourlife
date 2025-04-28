package java_07_advanced.ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        // Account 클래스의 인스턴스 생성
        Account account = new Account();

        // 10000원 예금
        account.deposit(10000);
        System.out.println("10,000원 입급했습니다. 잔액 : "+ account.getBalance());

        // 5000원 출금
        try {
            account.withdraw(5000);
            System.out.println("5,000원 출금했습니다. 잔액 : "+ account.getBalance());
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

        // 7000원 출금
        try {
            account.withdraw(7000);
            System.out.println("7,000원 출금했습니다. 잔액 : " + account.getBalance());
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
