package com.epam.spring.core.homeWorkLesson1.config;

import com.epam.spring.core.homeWorkLesson1.cars.BMW;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BMW.class})
public class AppCarConfig {

}
