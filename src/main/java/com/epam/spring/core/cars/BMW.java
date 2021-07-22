package com.epam.spring.core.cars;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class BMW implements Car{
    @Override
    public String getCar() {
        return "M3";
    }
}
