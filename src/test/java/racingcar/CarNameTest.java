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

        // when
        CarName carName = new CarName(name);

        // then
        assertThat(carName.getName()).isEqualTo(name);
    }

    @DisplayName("null 테스트")
    @Test
    void nullCarName() {
        // given
        String name = null;

        // when
        // then
        assertThatThrownBy(() -> {
            new CarName(name);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 1자 이상 5자 이하여야 합니다.");
    }

    @DisplayName("이름은 5자를 초과할 수 없다.")
    @Test
    void CarNameMaxLength() {
        // given
        String name = "abcdef";

        // then
        assertThatThrownBy(() -> {
            new CarName(name);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 1자 이상 5자 이하여야 합니다.");
    }

    @DisplayName("이름은 빈문자열일 수 없다.")
    @Test
    void CarNameMinLength() {
        // given
        String name = "";

        // then
        assertThatThrownBy(() -> {
            new CarName(name);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 1자 이상 5자 이하여야 합니다.");
    }
}
