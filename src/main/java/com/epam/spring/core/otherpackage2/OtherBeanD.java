package com.epam.spring.core.otherpackage2;

import com.epam.spring.core.otherpackage.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanD {
    private String name;

    @Autowired
    private OtherBeanA otherBeanA;

    @Override
    public String toString() {
        return name;
    }
}
