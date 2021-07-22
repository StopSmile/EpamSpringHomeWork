package com.epam.spring.core.homeWorkLesson1.beans2;

import org.springframework.stereotype.Component;

@Component
public class CatAnimal {
    private String name;

    public CatAnimal(){

    }

    public CatAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
