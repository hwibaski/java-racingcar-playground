package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class InputReceiverTest {
    @DisplayName("사용자의 입력을 받는다")
    @Test
    void userInputTest() {
        // given
        String input = "test";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        InputReceiver inputReceiver = new InputReceiver();

        // when
        String userInput = inputReceiver.enterUserInput();

        // then
        assertThat(userInput).isEqualTo("test");
    }
}
