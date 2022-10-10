package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.utils.Constants;

public class Cars {
    private final List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public Car getAt(Integer index) throws IllegalAccessException {
        if(index >= cars.size()) {
            throw new IllegalAccessException(Constants.ERROR_PREFIX+Constants.ERROR_ILLEGAL_ACCESS);
        }
        return cars.get(index);
    }

    public List<Car> getCars() {
        return cars;
    }
}
