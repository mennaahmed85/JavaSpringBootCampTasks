package com.task.bs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Task 1
        Circle CircleShape1 = (Circle) context.getBean("CircleShape", Circle.class);
        Circle CircleShape2 = (Circle) context.getBean("CircleShape", Circle.class);

        System.out.println(CircleShape1);
        System.out.println(CircleShape2);

        Shape ShapeShape1 = (Shape) context.getBean("SquareShape", Shape.class);
        Shape ShapeShape2 = (Shape) context.getBean("SquareShape", Shape.class);

        System.out.println(ShapeShape1);
        System.out.println(ShapeShape2);

        //Task 2
        ((ClassPathXmlApplicationContext) context).close();
    }
}
