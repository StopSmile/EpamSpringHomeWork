package com.epam.spring.core.homeWorkLesson1.config;

import com.epam.spring.core.homeWorkLesson1.beans1.BeanA;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BeanA.class})
public class AppConfig1 {

}
