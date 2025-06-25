package org.scoula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

// mvc 관련된 설정이나 객체 생성 + 주입 (Spring MVC용 컴포넌트 등록을 위한 스캔 패키지)
@EnableWebMvc // mvc 관련된 설정을 할 수 있는 파일로 등록 (@Configuration 대신 이거)
@ComponentScan(basePackages = "org.scoula.controller") // org.scoula.controller 아래에 있는 것들을 다 싱글톤으로 만들어 줘
public class ServletConfig implements WebMvcConfigurer {
    // 어떤 함수를 써서 설정해야 할지 이미 WebMvcConfigurer에 정의 되어 있음 (Structure에서 inherited 열고 확인)
    // 오버라이드 해서 내 상황에 맞게 정의해주면 됨

    // 프론트 파일(css, js, img)의 위치를 지정해주는 함수
    // /resources/img/a.png라고 요청이 들어오면 /resources/ 밑에서 찾겠다는 설정
    // <img src="/resources/img/a.png"> 반드시 /resources/ 이렇게 써줘야 인식한다
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**") // url이 /resources/로 시작하는 모든 경로
                .addResourceLocations("/resources/"); // webapp/resources/경로로 매핑
    }

    // 컨트롤러에서 받은 결과를 어떤 jsp 파일을 불러서 넣어줄지 위치를 설정하고
    // 뒤에 jsp 붙여서 만들어주는 기능의 함수
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // 뷰리졸버 객체를 생성하고
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);

        // 앞 -> 위치 지정하고
        bean.setPrefix("/WEB-INF/views/");

        // 뒤 -> jsp 지정
        bean.setSuffix(".jsp");

        // 이 객체를 등록한다.
        registry.viewResolver(bean);
    }
}
