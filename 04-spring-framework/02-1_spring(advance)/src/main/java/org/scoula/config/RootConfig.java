package org.scoula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.scoula") // 이거 적어줬으니까 이제 Chef랑 Restaurant 찾을 수 있음
public class RootConfig {
    // db사용 --> google mybatis사용 설정
    // 트랜잭션 설정
}
