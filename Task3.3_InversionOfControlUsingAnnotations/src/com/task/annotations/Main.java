package com.task.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Circle circle = (Circle) context.getBean("CircleBean", Circle.class);
        circle.setRadius(5.2);
        System.out.println(circle.getArea());

        Square square = (Square) context.getBean("SquareBean", Square.class);
        square.setRadius(3.2);
        System.out.println(square.getArea());

    }
}
