package com.epam.spring.core.homeWorkLesson2.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component("BeanB")
@Order(2)
@ConfigurationProperties(prefix = "server")
public class Pojo2 {
    private String name;
    private int value;

    public Pojo2(){

    }
    public Pojo2(String name, int value) {
        this.name = name;
        this.value = value;
    }

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
