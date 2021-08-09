package com.epam.spring.core.homeWorkLesson2.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("BeanD")
@Order(1)
@ConfigurationProperties(prefix = "server")
public class Pojo4 {
    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return name + " " + value;
    }
}
