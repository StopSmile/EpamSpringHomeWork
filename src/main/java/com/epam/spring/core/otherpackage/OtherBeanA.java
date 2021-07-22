package com.epam.spring.core.otherpackage;

import com.epam.spring.core.beans1.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanA {

    private String name = "Hello";

    public OtherBeanA() {

    }

    public OtherBeanA(String name) {
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
