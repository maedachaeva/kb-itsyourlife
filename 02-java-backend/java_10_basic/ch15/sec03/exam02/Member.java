package java_10_basic.ch15.sec03.exam02;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // HashSet은 equals() + hashCode() 기준으로 중복 판단하므로,
    // 직접 만든 객체를 저장할 땐 꼭 오버라이딩 해줘야 한다.
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
