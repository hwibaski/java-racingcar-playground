package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DelimiterTest {
    @DisplayName("구분자는 빈문자열을 허용하지 않습니다")
    @Test
    void delimiterEmptyStringTest() {
        // given
        String delimiterStr = "";

        // when
        // then
        assertThatThrownBy(() -> {
            new Delimiter(delimiterStr);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("구분자를 확인해주세요");
    }

    @DisplayName("구분자는 null을 허용하지 않습니다")
    @Test
    void delimiterNullTest() {
        // given
        String delimiterStr = null;

        // when
        // then
        assertThatThrownBy(() -> {
            new Delimiter(delimiterStr);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("구분자를 확인해주세요");
    }
}
