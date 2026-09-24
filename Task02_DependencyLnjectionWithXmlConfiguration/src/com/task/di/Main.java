package com.task.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //application context
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car car = (Car) container.getBean("carBean");
        car.insert("BMW");

        Plane plane = (Plane) container.getBean("planeBean");
        plane.insert("BMW2");
    }
}
