package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CommaSplitterTest {
    @DisplayName("주어진 문자열을 ,로 스플릿 후 문자열 리스트를 리턴한다")
    @Test
    void commaSplitReturnStringList() {
        // given
        String input = "test, test2";
        UserInput userInput = new UserInput(input);
        CommaSplitter commaSplitter = new CommaSplitter(userInput);
        int expectedListSize = 2;

        // when
        List<String> list = commaSplitter.splitByComma();

        // then
        assertThat(list.size()).isEqualTo(expectedListSize);
        assertThat(list).containsExactly("test", "test2");
    }

    @DisplayName("주어진 문자열의 , 사이에 공백이 있으면 모두 제거 후 리턴한다.")
    @Test
    void commaSplitReturnStripString() {
        // given
        String input = "test,                test2";
        UserInput userInput = new UserInput(input);
        CommaSplitter commaSplitter = new CommaSplitter(userInput);
        int expectedListSize = 2;

        // when
        List<String> list = commaSplitter.splitByComma();

        // then
        assertThat(list.size()).isEqualTo(expectedListSize);
        assertThat(list).containsExactly("test", "test2");
    }
}
