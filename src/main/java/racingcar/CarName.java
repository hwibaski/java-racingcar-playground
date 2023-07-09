package racingcar;

public class CarName {
    private final String name;
    private final CarNameLengthConstraint carNameLengthConstraint;


    public CarName(CarNameLengthConstraint carNameLengthConstraint, String name) {
        this.carNameLengthConstraint = carNameLengthConstraint;

        this.validateNameLength(name);
        this.name = name;
    }


    private void validateNameLength(String name) {
        int minLength = this.carNameLengthConstraint.getCarNameMinLength().getMinLength();
        int maxLength = this.carNameLengthConstraint.getCarNameMaxLength().getMaxLength();

        if (isNull(name)) {
            throw new IllegalArgumentException("이름은 " + minLength + "자 이상 " + maxLength + "자 이하여야 합니다.");
        }

        if (isNameViolateLengthContraint(name, minLength, maxLength)) {
            throw new IllegalArgumentException("이름은 " + minLength + "자 이상 " + maxLength + "자 이하여야 합니다.");
        }
    }

    private static boolean isNull(String name) {
        return name == null;
    }

    private boolean isNameViolateLengthContraint(String name, int minLength, int maxLength) {
        return name.length() > maxLength || name.length() < minLength;
    }

    public String getName() {
        return name;
    }
}
