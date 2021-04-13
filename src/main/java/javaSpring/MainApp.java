package javaSpring;

import javaSpring.config.CarApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarApplicationConfig.class);
        Car car1 = context.getBean(Car.class);
        car1.move();
        System.out.println(car1.getStatus());
        car1.stop();
        System.out.println(car1.getStatus());
    }
}
