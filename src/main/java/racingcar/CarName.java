package racingcar;

public class CarName {
    private final String name;
    private final int minLength;
    private final int maxLength;


    public CarName(int minLength, int maxLength, String name) {
        this.validateMinMaxLength(minLength, maxLength);
        this.minLength = minLength;
        this.maxLength = maxLength;

        this.validateNameLength(name);
        this.name = name;
    }

    private void validateMinMaxLength(int minLength, int maxLength) {
        if (minLength >= maxLength) {
            throw new IllegalArgumentException("최소 길이는 최대 길이보다 클 수 없습니다.");
        }

        if (minLength < 0 || maxLength < 0) {
            throw new IllegalArgumentException("이름 길이 제한은 음수일 수 없습니다");
        }
    }

    private void validateNameLength(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 " + this.minLength + "자 이상 " + this.maxLength + "자 이하여야 합니다.");
        }

        if (name.length() > this.maxLength || name.length() < this.minLength) {
            throw new IllegalArgumentException("이름은 " + this.minLength + "자 이상 " + this.maxLength + "자 이하여야 합니다.");
        }
    }

    public String getName() {
        return name;
    }
}
