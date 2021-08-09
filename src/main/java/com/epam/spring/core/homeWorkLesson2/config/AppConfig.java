package com.epam.spring.core.homeWorkLesson2.config;

import com.epam.spring.core.homeWorkLesson2.pojo.Pojo1;
import com.epam.spring.core.homeWorkLesson2.pojo.Pojo2;
import com.epam.spring.core.homeWorkLesson2.pojo.Pojo3;
import com.epam.spring.core.homeWorkLesson2.pojo.Pojo4;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Pojo1.class})
public class AppConfig {


}
