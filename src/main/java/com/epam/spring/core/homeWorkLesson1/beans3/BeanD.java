package com.epam.spring.core.homeWorkLesson1.beans3;

import org.springframework.stereotype.Component;

@Component
public class BeanD {
    private String name;

    public BeanD(){

    }
    public BeanD(String name) {
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
