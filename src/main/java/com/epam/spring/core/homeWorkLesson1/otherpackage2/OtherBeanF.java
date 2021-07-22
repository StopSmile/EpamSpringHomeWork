package com.epam.spring.core.homeWorkLesson1.otherpackage2;

import com.epam.spring.core.homeWorkLesson1.otherpackage.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanF {
    private String name;
    private OtherBeanC otherBeanC;
    @Autowired
    public void setOtherBeanC(OtherBeanC otherBeanC){
        this.otherBeanC = otherBeanC;
    }
    @Override
    public String toString(){
        return name;
    }
}
