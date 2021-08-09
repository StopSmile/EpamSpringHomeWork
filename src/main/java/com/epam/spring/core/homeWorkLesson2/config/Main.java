package com.epam.spring.core.homeWorkLesson2.config;

import com.epam.spring.core.homeWorkLesson2.pojo.Pojo1;
import com.epam.spring.core.homeWorkLesson2.pojo.Pojo2;
import com.epam.spring.core.homeWorkLesson2.pojo.Pojo3;
import com.epam.spring.core.homeWorkLesson2.pojo.Pojo4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties({Pojo2.class,Pojo3.class,Pojo4.class})
public class Main {
    public static void main(String[] args) {

        //ApplicationContext context = SpringApplication.run(Main.class, args);
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
        Pojo2 pojo2 = context1.getBean(Pojo2.class);
        Pojo3 pojo3 = context1.getBean(Pojo3.class);
        Pojo4 pojo4 = context1.getBean(Pojo4.class);
        System.out.println(pojo2);
        System.out.println(pojo3);
        System.out.println(pojo4);

        for (String x : context1.getBeanDefinitionNames()){
            System.out.println(x);
        }



    }
}
