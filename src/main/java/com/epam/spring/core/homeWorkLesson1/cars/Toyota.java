package com.epam.spring.core.homeWorkLesson1.cars;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class Toyota implements Car {

    @Override
    public String getCar() {
        return "Toyota Corolla";
    }
}
