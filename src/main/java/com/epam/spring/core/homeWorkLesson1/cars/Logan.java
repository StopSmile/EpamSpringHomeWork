package com.epam.spring.core.homeWorkLesson1.cars;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Logan implements Car{
    @Override
    public String getCar() {
        return "Renault Logan";
    }
}
