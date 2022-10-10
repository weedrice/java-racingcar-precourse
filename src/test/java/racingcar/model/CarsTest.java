package racingcar.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarsTest {
    final String firstCarNameString = "one";
    final String secondCarNameString = "two";

    @Test
    void createCars() throws IllegalAccessException {
        Cars cars = new Cars();
        CarName firstCarName = new CarName(firstCarNameString);
        Car firstCar = new Car(firstCarName);
        CarName secondCarName = new CarName(secondCarNameString);
        Car secondCar = new Car(secondCarName);

        cars.addCar(firstCar);
        Assertions.assertEquals(firstCar, cars.getAt(0));
        Assertions.assertThrows(IllegalAccessException.class, () -> cars.getAt(1));
        cars.addCar(secondCar);
        Assertions.assertEquals(secondCar, cars.getAt(1));
        Assertions.assertEquals(2, cars.getCars().size());
    }
}
