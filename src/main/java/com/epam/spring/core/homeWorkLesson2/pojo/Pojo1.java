package com.epam.spring.core.homeWorkLesson2.pojo;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;



@Component("BeanA")
public class Pojo1 {

    private String name;
    private int value;

    public Pojo1() {

    }

    public Pojo1(String name, int value) {
        this.name = name;
        this.value = value;
    }


    @Override
    public String toString() {
        return name + " " + value;
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
}
