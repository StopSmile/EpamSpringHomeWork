package com.epam.spring.core.homeWorkLesson1;


import com.epam.spring.core.homeWorkLesson1.cars.GeneralBean;
import com.epam.spring.core.homeWorkLesson1.config.AppCarConfig;
import com.epam.spring.core.homeWorkLesson1.config.AppConfig1;
import com.epam.spring.core.homeWorkLesson1.config.AppConfig2;
import com.epam.spring.core.homeWorkLesson1.config.AppConfig3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


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
