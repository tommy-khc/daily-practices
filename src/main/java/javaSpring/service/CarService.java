package javaSpring.service;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import javaSpring.Car;

import javax.annotation.Resource;

public class CarService {
    @Resource(name = "carBean1")
    private Car car;

    public void move(){
        car.setStatus("Moving");
    }

    public void stop(){
        car.setStatus("Stopped");
    }
}
