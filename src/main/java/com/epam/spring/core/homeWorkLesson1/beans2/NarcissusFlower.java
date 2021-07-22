package com.epam.spring.core.homeWorkLesson1.beans2;

import org.springframework.stereotype.Component;

@Component
public class NarcissusFlower {
    private String name;
    public NarcissusFlower(){

    }
    public NarcissusFlower(String name) {
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
