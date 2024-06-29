package homework35;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import java.util.Arrays;

public class CarTest {
    Car[] cars;

    @BeforeEach
    void setUp(){
        cars = new Car[6];
        cars[0] = new Car("Opel", 5500);
        cars[1] = new Car("Opel", 3500);
        cars[2] = new Car("Opel", 7200);
        cars[3] = new Car("Opel", 6800);
        cars[4] = new Car("Opel", 1200);
        cars[5] = new Car("BMW", 3299);
    }

    @Test
    void testComparator(){
        Arrays.sort(cars);
        Assertions.assertEquals(1200, cars[1].getPrice());
        Assertions.assertEquals(7200, cars[cars.length - 1].getPrice());
        Assertions.assertEquals("BMW", cars[0].getName());
    }
}
