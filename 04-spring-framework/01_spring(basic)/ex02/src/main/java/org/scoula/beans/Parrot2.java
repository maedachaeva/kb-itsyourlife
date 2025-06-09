package org.scoula.beans;

import org.springframework.stereotype.Component;

@Component
public class Parrot2 {
    private String name = "Koko"; // 이거 위험? 해서 비추 근데
    // 그 문제 해결하기 위해선지 별갠지 모르겠지만 여기 final 붙여주기도 한다?

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot2 : " + name ;
    }
}
