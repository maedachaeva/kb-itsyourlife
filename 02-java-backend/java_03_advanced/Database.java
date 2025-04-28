package java_03_advanced;

// 다음 클래스를 Singleton 객체로 만드세요
public class Database {
    private String connection = "MySQL";

    // 추가
    private static Database database = new Database();

    private Database() { }

    public static Database getInstance() {
        return database;
    }
    // ====

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }
    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }

    // 추가
    public String getConnection() {
        return connection;
    }
    // ====
}
