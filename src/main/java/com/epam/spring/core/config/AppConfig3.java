package com.epam.spring.core.config;

import com.epam.spring.core.otherpackage.OtherBeanA;
import com.epam.spring.core.otherpackage2.OtherBeanD;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {OtherBeanA.class})
@ComponentScan(basePackageClasses = {OtherBeanD.class})
public class AppConfig3 {
    @Bean
    public OtherBeanD otherBeanD(){
        return new OtherBeanD();
    }
}
