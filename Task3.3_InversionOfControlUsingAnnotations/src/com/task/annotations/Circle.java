package com.task.annotations;

import org.springframework.stereotype.Component;

@Component("CircleBean")
public class Circle implements Shape {
    private double radius;

    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
       return Math.PI * radius * radius;
    }
}

