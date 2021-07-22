package com.epam.spring.core.homeWorkLesson1.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanA {

    private String name;

    public BeanA() {
    }

    public BeanA(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void sayHello(){
        System.out.println("Hello i am = " + name );
    }

    @Override
    public String toString() {
        return name;
    }
}
