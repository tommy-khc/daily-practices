package javaSpring;

import javaSpring.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;

public class Car {
    private String name;
    private String size;
    private Color color;
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

    public Car (Color color) {
        this.color = color;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", color=" + color +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        String hashCodeString = this.toString();
        return hashCodeString.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
