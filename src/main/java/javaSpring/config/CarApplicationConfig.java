package javaSpring.config;

import javaSpring.Car;
import javaSpring.service.CarService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarApplicationConfig {
    @Bean(name = "carBean1")
    public Car carBean(){
        return new Car();
    }

    @Bean
    public CarService carServiceBean(){
        return new CarService();
    }

}
