package racingcar;

public class CarName {
    private final String name;
    private final CarNameLengthConstraint carNameLengthConstraint;


    public CarName(String name) {
        this.carNameLengthConstraint = new CarNameLengthConstraint(new CarNameMinLength(1), new CarNameMaxLength(5));
        this.validateNameLength(name);
        this.name = name;
    }


    private void validateNameLength(String name) {
        int minLength = this.carNameLengthConstraint.getCarNameMinLength().getMinLength();
        int maxLength = this.carNameLengthConstraint.getCarNameMaxLength().getMaxLength();

        if (isNull(name)) {
            throw new IllegalArgumentException("이름은 " + minLength + "자 이상 " + maxLength + "자 이하여야 합니다.");
        }

        if (isNameViolateLengthConstraint(name, minLength, maxLength)) {
            throw new IllegalArgumentException("이름은 " + minLength + "자 이상 " + maxLength + "자 이하여야 합니다.");
        }
    }

    private boolean isNull(String name) {
        return name == null;
    }

    private boolean isNameViolateLengthConstraint(String name, int minLength, int maxLength) {
        return name.length() > maxLength || name.length() < minLength;
    }

    public String getName() {
        return name;
    }
}
