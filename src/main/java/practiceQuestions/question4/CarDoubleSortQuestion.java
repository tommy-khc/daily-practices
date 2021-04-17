package practiceQuestions.question4;

import enums.IQ;
import javaSpring.Car;

import java.awt.*;
import java.util.List;

public class CarDoubleSortQuestion {
        public static List<Car> ans(List<Car> carList) {
            for (int j = 1; j < carList.size(); j++) {
                Car currentCar = carList.get(j);
                int i = j - 1;
                while (i > 0 && carList.get(i).getColor() != Color.WHITE) {
                    carList.set(i+1, carList.get(i));
                    i = i - 1;
                }
                carList.set(i+1, currentCar);
            }
            for (int j = 1; j < carList.size(); j++) {
                Car currentCar = carList.get(j);
                int i = j - 1;
                while (i > 0 && carList.get(i).getColor() == Color.BLACK) {
                    carList.set(i+1, carList.get(i));
                    i = i - 1;
                }
                carList.set(i+1, currentCar);
            }
            return carList;
        }

}
