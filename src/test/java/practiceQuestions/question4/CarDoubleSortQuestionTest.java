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
        List<Car> answer = question.calculateAnswer();

        List<Car> expectedAns = new ArrayList<>();
        expectedAns.add(new Car(Color.WHITE));
        expectedAns.add(new Car(Color.WHITE));
        expectedAns.add(new Car(Color.WHITE));
        expectedAns.add(new Car(Color.WHITE));
        expectedAns.add(new Car(Color.BLUE));
        expectedAns.add(new Car(Color.BLUE));
        expectedAns.add(new Car(Color.BLUE));
        expectedAns.add(new Car(Color.BLUE));
        expectedAns.add(new Car(Color.BLACK));
        expectedAns.add(new Car(Color.BLACK));
        expectedAns.add(new Car(Color.BLACK));
        expectedAns.add(new Car(Color.BLACK));

        assertEquals(expectedAns, answer);
    }
}
