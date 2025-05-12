package java_11_advanced.ch16.sec05.exam01;

/*결과: 14.0
결과: 40.0*/
public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 정적 메서드 참조
        // 람다식
        // person.action((x, y) -> Computer.staticMethod(x, y));
        person.action(Computer :: staticMethod);


        // 인스턴스 메서드 참조
        Computer com = new Computer();

        // 람다식
        // person.action((x, y) -> com.instanceMethod(x, y));
        person.action(com :: instanceMethod);
    }
}
