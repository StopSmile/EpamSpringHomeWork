package com.epam.spring.core.homeWorkLesson2.pojo;

import org.springframework.stereotype.Component;

@Component("BeanE")
public class Pojo5 {
    private String name;
    private int value;

    @Override
    public String toString(){
        return name + " " + value;
    }
}
