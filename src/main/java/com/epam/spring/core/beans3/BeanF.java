package com.epam.spring.core.beans3;

import org.springframework.stereotype.Component;

@Component
public class BeanF {
    private String name;

    public BeanF(){

    }
    public BeanF(String name) {
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
