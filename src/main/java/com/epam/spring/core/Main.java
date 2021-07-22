package com.epam.spring.core;


import com.epam.spring.core.beans1.BeanA;
import com.epam.spring.core.beans1.BeanC;
import com.epam.spring.core.cars.GeneralBean;
import com.epam.spring.core.config.AppCarConfig;
import com.epam.spring.core.config.AppConfig1;
import com.epam.spring.core.config.AppConfig2;
import com.epam.spring.core.config.AppConfig3;
import com.epam.spring.core.otherpackage.OtherBeanA;
import com.epam.spring.core.otherpackage.OtherBeanB;
import com.epam.spring.core.otherpackage.OtherBeanC;
import com.epam.spring.core.otherpackage2.OtherBeanD;
import com.epam.spring.core.otherpackage2.OtherBeanE;
import com.epam.spring.core.otherpackage2.OtherBeanF;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig1.class);
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig2.class);
        ApplicationContext context3 = new AnnotationConfigApplicationContext(AppConfig3.class);
        ApplicationContext carContext = new AnnotationConfigApplicationContext(AppCarConfig.class);
        for (String x : context1.getBeanDefinitionNames()){
            System.out.println(x);
        }
        for (String x : context2.getBeanDefinitionNames()){
            System.out.println(x);
        }
        for (String x : context3.getBeanDefinitionNames()){
            System.out.println(x);
        }
        for (String x : carContext.getBeanDefinitionNames()){
            System.out.println(x);
        }
        carContext.getBean(GeneralBean.class).printCars();



    }
}
