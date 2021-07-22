package com.epam.spring.core.homeWorkLesson1.beans1;
import org.springframework.stereotype.Component;

@Component
public class BeanC {
    private String name = "Hello";
    public BeanC(){

    }
    public BeanC(String name) {
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
