package com.epam.spring.core.config;

import com.epam.spring.core.beans1.BeanA;
import com.epam.spring.core.otherpackage.OtherBeanA;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BeanA.class})
public class AppConfig1 {

}
