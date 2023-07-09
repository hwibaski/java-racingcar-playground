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
        int minLengthNum = 1;
        CarNameMinLength minLength = new CarNameMinLength(minLengthNum);
        int maxLengthNum = 5;
        CarNameMaxLength maxLength = new CarNameMaxLength(maxLengthNum);
        CarNameLengthConstraint carNameLengthConstraint = new CarNameLengthConstraint(minLength, maxLength);

        CarName carName = new CarName(carNameLengthConstraint, name);

        // when
        Car car = new Car(carName);

        // then
        assertThat(car.getName()).isEqualTo(name);
    }
}
