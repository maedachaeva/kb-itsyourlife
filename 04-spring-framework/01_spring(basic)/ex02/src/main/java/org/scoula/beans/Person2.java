package org.scoula.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person2 {
    private String name = "Ella";

    // 이거 이해 안 감.. 아 일단 뭐 필드, 생성자, set 중에 필드에 주입? 하는 방법이라고 -> Person3이 생성자 방법이다
    @Autowired
    private Parrot2 parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot2 getParrot() {
        return parrot;
    }

    public void setParrot(Parrot2 parrot) {
        this.parrot = parrot;
    }
}
