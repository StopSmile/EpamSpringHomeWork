package com.epam.spring.core.config;

import com.epam.spring.core.cars.BMW;
import com.epam.spring.core.cars.Toyota;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {BMW.class})
public class AppCarConfig {

}
