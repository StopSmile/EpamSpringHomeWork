package com.epam.spring.core.homeWorkLesson1.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private String name;

    public BeanB(){

    }

    public BeanB(String name) {
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
