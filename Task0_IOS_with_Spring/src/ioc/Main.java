package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // intialize container
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean of circle
        Shap circle = container.getBean("circle",Shap.class);
        circle.draw("Circle");

        Shap rectangle = container.getBean("rectangle",Shap.class);
        rectangle.draw("Rectangle");
    }
}
