package com.epam.spring.core.homeWorkLesson1.cars;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Opel implements Car{
    @Override
    public String getCar() {
        return "Opel Astra";
    }
}
