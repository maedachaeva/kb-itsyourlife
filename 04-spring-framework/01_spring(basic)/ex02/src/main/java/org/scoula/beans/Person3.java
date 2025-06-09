package org.scoula.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person3 {
    private String name = "Ella";

    @Autowired
    private final Parrot2 parrot;

    public Person3(Parrot2 parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot2 getParrot() {
        return parrot;
    }

    // parrot은 setter가 없다 (이유는 찾아보기 아 이미 parrot으로 주입해줬으니까 따로 set 할 필요가 없나?
}
