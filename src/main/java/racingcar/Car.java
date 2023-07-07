package racingcar;

public class Car {
    private final CarName name;

    public Car(CarName name) {
        this.name = name;
    }

    public String getName() {
        return name.getName();
    }
}
