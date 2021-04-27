package practiceQuestions.question4;

import javaSpring.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;

public class CarDoubleSortQuestion {

    private static final Logger
    LOGGER = LogManager.getLogger(CarDoubleSortQuestion.class);

    private List<Car> carList;

    public CarDoubleSortQuestion(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> calculateAnswer () {

        for (int j = 1; j < carList.size(); j++) {
            Car currentCar = carList.get(j);
            int i = j - 1;
            while (i >= 0 && carList.get(i).getColor() != Color.WHITE) {
                carList.set(i+1, carList.get(i));
                i = i - 1;
            }
            carList.set(i+1, currentCar);
        }
        List<String> carColorStringList = carList.stream().map(o -> o.getColor().toString()).collect(Collectors.toList());
//        LOGGER.debug("The first sorting result: {}", carColorStringList);

        for (int j = 1; j < carList.size(); j++) {
            Car currentCar = carList.get(j);
            int i = j - 1;
            while (i >= 0 && carList.get(i).getColor() == Color.BLACK) {
                carList.set(i+1, carList.get(i));
                i = i - 1;
            }
            carList.set(i+1, currentCar);
        }
        carColorStringList = carList.stream().map(o -> o.getColor().toString()).collect(Collectors.toList());
//        LOGGER.debug("The second sorting result: {}", carColorStringList);
        LOGGER.info("Result: {}", carColorStringList);

        return carList;
    }

}
