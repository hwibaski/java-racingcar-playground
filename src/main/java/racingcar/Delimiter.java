package racingcar;

public class Delimiter {
    private final String delimiter;

    public Delimiter(String delimiter) {
        validateDelimiter(delimiter);
        this.delimiter = delimiter;
    }

    private void validateDelimiter(String delimiter) {
        if (isNull(delimiter) || isEquals(delimiter)) {
            throw new IllegalArgumentException("구분자를 확인해주세요");
        }
    }

    private boolean isEquals(String delimiter) {
        return delimiter.equals("");
    }

    private boolean isNull(String delimiter) {
        return delimiter == null;
    }

    public String getDelimiter() {
        return delimiter;
    }
}
