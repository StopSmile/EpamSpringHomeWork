package com.epam.spring.core.config;

import com.epam.spring.core.beans2.CatAnimal;
import com.epam.spring.core.beans3.BeanD;
import com.epam.spring.core.beans3.BeanF;
import com.epam.spring.core.otherpackage.OtherBeanA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {CatAnimal.class})
public class AppConfig2 {
    @Bean
    public BeanD beanD(){
        return new BeanD("beanD");
    }
    @Bean
    public BeanF beanF(){
        return new BeanF("beanF");
    }
    @Bean
    public CatAnimal catAnimal(){
        return new CatAnimal("Murzik");
    }
}
