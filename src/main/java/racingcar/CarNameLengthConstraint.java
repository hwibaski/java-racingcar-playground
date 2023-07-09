package racingcar;

public class CarNameLengthConstraint {
    private final CarNameMinLength carNameMinLength;
    private final CarNameMaxLength carNameMaxLength;

    public CarNameLengthConstraint(CarNameMinLength carNameMinLength, CarNameMaxLength carNameMaxLength) {
        this.validateMinMaxLength(carNameMinLength, carNameMaxLength);
        this.carNameMinLength = carNameMinLength;
        this.carNameMaxLength = carNameMaxLength;
    }

    private void validateMinMaxLength(CarNameMinLength minLength, CarNameMaxLength maxLength) {
        if (minLength.getMinLength() >= maxLength.getMaxLength()) {
            throw new IllegalArgumentException("최소 길이는 최대 길이보다 클 수 없습니다.");
        }
    }

    public CarNameMinLength getCarNameMinLength() {
        return carNameMinLength;
    }

    public CarNameMaxLength getCarNameMaxLength() {
        return carNameMaxLength;
    }
}
