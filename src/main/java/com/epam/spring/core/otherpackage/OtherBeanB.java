package com.epam.spring.core.otherpackage;

import com.epam.spring.core.beans1.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanB {

    private String name;

    public OtherBeanB() {

    }

    public OtherBeanB(String name) {
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
