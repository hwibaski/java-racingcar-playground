package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgeTest {
    @DisplayName("자동차 리스트에서 가장 멀리간 자동차들을 찾는다. - pos 값이 가장 높은 차들을 찾는다")
    @Test
    void findWinnerCars() {
        // given
        Car car1 = new Car(new CarName("car1"), 1);
        Car car2 = new Car(new CarName("car2"), 3);
        Car car3 = new Car(new CarName("car3"), 5);

        // when
        Judge judge = new Judge(List.of(car1, car2, car3));
        List<Car> winnerCars = judge.findWinners();

        // then
        int expectedWinnerCount = 1;
        assertThat(winnerCars.size()).isEqualTo(expectedWinnerCount);
    }

}
