package javaSpring;

import javaSpring.config.CarApplicationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CarApplicationConfig.class)
public class CarTest {
    @Resource(name = "carBean1")
    Car car1;

    @Test
    public void carMoveTest(){
        car1.move();
        assertEquals("Moving", car1.getStatus());
    }
}
