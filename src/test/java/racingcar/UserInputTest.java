package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserInputTest {
    @DisplayName("사용자가 입력한 문자를 세팅힌다.")
    @Test
    void temp() {
        // given
        String receivedUserInput = "ralph, toby, coby";

        // when
        UserInput userInput = new UserInput(receivedUserInput);

        // then
        assertThat(userInput.getReceivedUserInput()).isEqualTo(receivedUserInput);
    }
}
