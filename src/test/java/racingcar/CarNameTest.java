package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}
