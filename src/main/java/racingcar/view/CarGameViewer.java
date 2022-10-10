package racingcar.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import racingcar.utils.Constants;

public class CarGameViewer {
    public String getCarNames() {
        System.out.println(Constants.MESSAGE_CAR_NAME_INPUT+Constants.MESSAGE_CAR_NAME_CONDITION);
        return readLine();
    }

    public String getRepeatCount() {
        System.out.println(Constants.MESSAGE_GAME_REPEAT_COUNT);
        return readLine();
    }
}
