package racingcar;

public class CarNameMinLength {
    private final int minLength;

    public CarNameMinLength(int minLength) {
        this.validateMinLength(minLength);
        this.minLength = minLength;
    }

    private void validateMinLength(int minLength) {
        if (minLength <= 0) {
            throw new IllegalArgumentException("이름 길이 제한은 음수이거나 0일 수 없습니다");
        }
    }

    public int getMinLength() {
        return minLength;
    }
}
