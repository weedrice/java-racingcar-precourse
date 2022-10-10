package racingcar.model;

import racingcar.utils.Constants;

public class Car {
    private final CarName carName;
    private CarPosition carPosition;

    public Car(CarName carName) {
        this.carName = carName;
        this.carPosition = new CarPosition();
    }

    public void moveCarPosition(Integer randomNumber) {
        if(randomNumber >= Constants.CAR_MOVING_CONDITION) {
            this.carPosition = new CarPosition(this.getCarPosition() + Constants.CAR_MOVING_AMOUNT);
        }
    }

    public String getCarName() {
        return carName.getCarName();
    }

    public Integer getCarPosition() {
        return carPosition.getCarPosition();
    }
}