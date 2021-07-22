package com.epam.spring.core.homeWorkLesson1.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class GeneralBean {
    @Autowired
    private List<Car> cars;

    public void printCars(){
        for (Car car : cars){
            System.out.println(car.getCar());
        }
    }
}
