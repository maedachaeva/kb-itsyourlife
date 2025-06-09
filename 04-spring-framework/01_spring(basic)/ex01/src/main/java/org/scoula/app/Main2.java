package org.scoula.app;

import org.scoula.config.ProjectConfig2;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        Parrot p = context.getBean("miki", Parrot.class); // 여기 miki 빼면 왜 오류나는지 확인하기
        System.out.println(p.getName());

    }
}
