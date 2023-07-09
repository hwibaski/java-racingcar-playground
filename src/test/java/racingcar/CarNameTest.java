package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {
    @DisplayName("CarName은 초기화 시 name 필드를 가진다.")
    @Test
    void carName() {
        // given
        String name = "test";
        int minLengthNum = 1;
        CarNameMinLength minLength = new CarNameMinLength(minLengthNum);
        int maxLengthNum = 5;
        CarNameMaxLength maxLength = new CarNameMaxLength(maxLengthNum);
        CarNameLengthConstraint carNameLengthConstraint = new CarNameLengthConstraint(minLength, maxLength);

        // when
        CarName carName = new CarName(carNameLengthConstraint, name);

        // then
        assertThat(carName.getName()).isEqualTo(name);
    }

    @DisplayName("null 테스트")
    @Test
    void nullCarName() {
        // given
        String name = null;
        int minLengthNum = 1;
        CarNameMinLength minLength = new CarNameMinLength(minLengthNum);
        int maxLengthNum = 5;
        CarNameMaxLength maxLength = new CarNameMaxLength(maxLengthNum);
        CarNameLengthConstraint carNameLengthConstraint = new CarNameLengthConstraint(minLength, maxLength);

        // when
        // then
        assertThatThrownBy(() -> {
            new CarName(carNameLengthConstraint, name);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 1자 이상 5자 이하여야 합니다.");
    }

    @DisplayName("이름은 5자를 초과할 수 없다.")
    @Test
    void CarNameMaxLength() {
        // given
        String name = "abcdef";
        int minLengthNum = 1;
        CarNameMinLength minLength = new CarNameMinLength(minLengthNum);
        int maxLengthNum = 5;
        CarNameMaxLength maxLength = new CarNameMaxLength(maxLengthNum);
        CarNameLengthConstraint carNameLengthConstraint = new CarNameLengthConstraint(minLength, maxLength);

        // then
        assertThatThrownBy(() -> {
            new CarName(carNameLengthConstraint, name);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 1자 이상 5자 이하여야 합니다.");
    }

    @DisplayName("이름은 빈문자열일 수 없다.")
    @Test
    void CarNameMinLength() {
        // given
        String name = "";
        int minLengthNum = 1;
        CarNameMinLength minLength = new CarNameMinLength(minLengthNum);
        int maxLengthNum = 5;
        CarNameMaxLength maxLength = new CarNameMaxLength(maxLengthNum);
        CarNameLengthConstraint carNameLengthConstraint = new CarNameLengthConstraint(minLength, maxLength);

        // then
        assertThatThrownBy(() -> {
            new CarName(carNameLengthConstraint, name);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 1자 이상 5자 이하여야 합니다.");
    }
}
