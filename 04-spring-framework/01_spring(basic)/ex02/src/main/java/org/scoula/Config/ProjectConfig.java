package org.scoula.Config;

import org.scoula.beans.Parrot;
import org.scoula.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

//    @Bean
//    Person person() {
//        Person p = new Person();
//        p.setName("Ella");
//        return p;
//    }

    // p17 메서드 의존성 주입 위해서 Person 수정
    @Bean
    Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }
}
