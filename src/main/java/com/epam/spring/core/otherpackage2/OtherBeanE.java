package com.epam.spring.core.otherpackage2;

import com.epam.spring.core.otherpackage.OtherBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanE {
    private String name;
    private OtherBeanB otherBeanB;
    @Autowired
    public OtherBeanE(OtherBeanB otherBeanB){
        this.otherBeanB = otherBeanB;
    }
    @Override
    public String toString() {
        return name;
    }
    public void setOtherBeanBName(String name){
        otherBeanB.setName(name);
    }
    public void sayHelloOtherBeanB(){
        System.out.println(otherBeanB.getName());
    }
}
