package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @DisplayName("자동차는 초기화 시 이름을 가진다")
    @Test
    void carHasName() {
        // given
        String name = "eden";
        int minLength = 1;
        int maxLength = 5;
        CarName carName = new CarName(minLength, maxLength, name);

        // when
        Car car = new Car(carName);

        // then
        assertThat(car.getName()).isEqualTo(name);
    }
}
