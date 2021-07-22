package com.epam.spring.core.beans3;


import org.springframework.stereotype.Component;

@Component
public class BeanE {
    private String name;
    public BeanE(){

    }
    public BeanE(String name) {
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
