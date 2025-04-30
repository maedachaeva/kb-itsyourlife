package java_09_advanced.ch13.sec03.exam01;

public class GenericExample<T> {
    // Box 클래스 이용하여 boxing() 제너릭 메서드 정의

    // 제너릭 메서드 정의법
    // public <A, B, ...> 리턴타입 메서드명(매개변수, ...) { ... }

    // main()은 static 메서드다. 근데 boxing()이 static이 아니면,
    // static인 main() 안에서 비-static 메서드를 직접 부를 수 없다.
    public static  <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>(); // 타입 T로 Box 객체 생성
        box.set(t); // T 타입 값 넣기
        return box; // 완성된 객체 반환
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intValue = box1.get();
        System.out.println(intValue);

        Box<String> box2 = boxing("홍길동");
        String strValue = box2.get();
        System.out.println(strValue);
    }
}
