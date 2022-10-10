package racingcar.model;

import racingcar.utils.Constants;

public class CarPosition {
    private final Integer carPosition;

    public CarPosition() {
        this.carPosition = Constants.DEFAULT_CAR_POSITION;
    }

    public Integer getCarPosition() {
        return this.carPosition;
    }
}
