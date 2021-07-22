package com.epam.spring.core.beans2;

import org.springframework.stereotype.Component;

@Component
public class RoseFlower {
    private String name;

    public RoseFlower(){

    }
    public RoseFlower(String name) {
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
