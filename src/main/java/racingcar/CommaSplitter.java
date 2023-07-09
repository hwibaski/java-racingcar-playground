package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSplitter {
    private final UserInput stringToSplit;
    private final Delimiter delimiter;

    public CommaSplitter(UserInput stringToSplit) {
        this.stringToSplit = stringToSplit;
        this.delimiter = new Delimiter(",");
    }

    public List<String> splitByComma() {
        return Arrays
                .stream(this.stringToSplit.getReceivedUserInput().split(this.delimiter.getDelimiter()))
                .map(String::strip)
                .collect(Collectors.toList());
    }
}
