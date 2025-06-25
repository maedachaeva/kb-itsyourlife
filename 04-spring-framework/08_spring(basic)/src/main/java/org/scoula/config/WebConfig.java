package org.scoula.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {RootConfig.class}; // 0 지우고 어떤 파일인지(만든 거) 적기
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {ServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() { // 프론트 컨트롤러 언제 적용할지
        return new String[] {"/"}; // 다 라는 뜻
    }

    // http의 body로 전송되는 post 방식의 데이터는
    // 프론트 컨트롤러가 받기 전에 미리 utf-8로 인코딩을 먼저 한 후 받게 설정함 (UTF-8로 바꿔주는 필터)
    @Override
    protected Filter[] getServletFilters() {
        //이미 만들어져 있는 필터 갖다 쓰기
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);

        return new Filter[] {characterEncodingFilter};
    }
}
