package com.epam.spring.core.homeWorkLesson1.otherpackage2;

import com.epam.spring.core.homeWorkLesson1.otherpackage.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
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
