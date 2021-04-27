package practiceQuestions.question4;

import javaSpring.Car;
import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CarDoubleSortQuestionTest {

    @Test
    public void Test1 () {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car(Color.BLACK));
        carList.add(new Car(Color.WHITE));
        carList.add(new Car(Color.BLUE));
        carList.add(new Car(Color.BLACK));
        carList.add(new Car(Color.WHITE));
        carList.add(new Car(Color.BLUE));
        carList.add(new Car(Color.BLACK));
        carList.add(new Car(Color.WHITE));
        carList.add(new Car(Color.BLUE));
        carList.add(new Car(Color.BLACK));
        carList.add(new Car(Color.WHITE));
        carList.add(new Car(Color.BLUE));

        CarDoubleSortQuestion question = new CarDoubleSortQuestion(carList);
        List<Car> carListAns = question.calculateAnswer();

        List<Car> carListExpectedAns = new ArrayList<>();
        carListExpectedAns.add(new Car(Color.WHITE));
        carListExpectedAns.add(new Car(Color.WHITE));
        carListExpectedAns.add(new Car(Color.WHITE));
        carListExpectedAns.add(new Car(Color.WHITE));
        carListExpectedAns.add(new Car(Color.BLUE));
        carListExpectedAns.add(new Car(Color.BLUE));
        carListExpectedAns.add(new Car(Color.BLUE));
        carListExpectedAns.add(new Car(Color.BLUE));
        carListExpectedAns.add(new Car(Color.BLACK));
        carListExpectedAns.add(new Car(Color.BLACK));
        carListExpectedAns.add(new Car(Color.BLACK));
        carListExpectedAns.add(new Car(Color.BLACK));

        assertEquals(carListExpectedAns, carListAns);
    }
}
