package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameMinLengthTest {

    @DisplayName("이름 길이 제한은 음수이거나 0일 수 없습니다")
    @Test
    void mustBePositiveAndGreaterThanZero() {
        // given
        int minLengthNum = 0;

        // when
        // then
        assertThatThrownBy(() -> {
            new CarNameMinLength(minLengthNum);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름 길이 제한은 음수이거나 0일 수 없습니다");
    }
}
