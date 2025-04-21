package java_04_basic.ch07.sec07.exam01;

// p308처럼 그림 그려서 풀기
class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        /**
         * 상속 관계가 아님
         *
         * 상속 계층에 있어야만 형변환 가능
         * 형제 클래스나 다른 패키지/루트는 불가능
         * */
        // B b3 = e;
        // C c2 = d;
    }
}
