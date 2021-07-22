package com.epam.spring.core.homeWorkLesson1.otherpackage;

import org.springframework.stereotype.Component;

@Component
public class OtherBeanA {

    private String name = "Hello";

    public OtherBeanA() {

    }

    public OtherBeanA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
