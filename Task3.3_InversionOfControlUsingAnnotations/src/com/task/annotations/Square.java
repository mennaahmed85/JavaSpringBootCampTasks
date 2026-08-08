package com.task.annotations;

import org.springframework.stereotype.Component;

@Component("SquareBean")
public class Square implements Shape {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
