package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameMaxLengthTest {
    @DisplayName("이름 길이 제한은 음수이거나 0일 수 없습니다")
    @Test
    void mustBePositiveAndGreaterThanZero() {
        // given
        int maxLengthNum = 0;

        // when
        // then
        assertThatThrownBy(() -> {
            CarNameMaxLength maxLength = new CarNameMaxLength(maxLengthNum);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름 길이 제한은 음수이거나 0일 수 없습니다");
    }
}
