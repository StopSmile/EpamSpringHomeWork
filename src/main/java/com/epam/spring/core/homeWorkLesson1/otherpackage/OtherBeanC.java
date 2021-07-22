package com.epam.spring.core.homeWorkLesson1.otherpackage;

import org.springframework.stereotype.Component;

@Component
public class OtherBeanC {
    private String name;

    public OtherBeanC() {

    }

    public OtherBeanC(String name) {
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
