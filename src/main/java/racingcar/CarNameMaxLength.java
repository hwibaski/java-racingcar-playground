package racingcar;

public class CarNameMaxLength {
    private final int maxLength;

    public CarNameMaxLength(int maxLength) {
        this.validateMinLength(maxLength);
        this.maxLength = maxLength;
    }

    private void validateMinLength(int minLength) {
        if (minLength <= 0) {
            throw new IllegalArgumentException("이름 길이 제한은 음수이거나 0일 수 없습니다");
        }
    }

    public int getMaxLength() {
        return maxLength;
    }
}
