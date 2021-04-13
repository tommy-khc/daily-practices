package javaSpring;

import javaSpring.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;

public class Car {
    private String name;
    private String size;
    private int price;
    private String status;

    @Autowired
    private CarService carService;

    public Car() {
    }

    public Car(String name, String size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public void move(){
        carService.move();
    }

    public void stop(){
        carService.stop();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
