package com.di.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
   public static void main(String[] args) {
     //define container
      ApplicationContext context = new ClassPathXmlApplicationContext("com/di/task/applicationContext.xml");
      Circle circle = (Circle) context.getBean("circle");

      circle.draw2d();
      circle.draw3d();

      System.out.println("---------------------------------------------------------");

      Square square = (Square) context.getBean("square");
      square.draw3d();
      square.draw2d();
   }
}
