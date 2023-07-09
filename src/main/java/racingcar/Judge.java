package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class Judge {
    private final List<Car> cars;

    public Judge(List<Car> cars) {
        validateCars(cars);
        this.cars = cars;
    }

    private void validateCars(List<Car> cars) {
        if (cars.isEmpty()) {
            throw new IllegalArgumentException("경주를 한 자동차가 없습니다. 따라서 판별할 수 없습니다.");
        }
    }


    public List<Car> findWinners() {
        int maxPos = this.findMaxPosAroundCars();
        return cars.stream()
                .filter(car -> car.getPos() == maxPos)
                .collect(Collectors.toList());
    }

    private int findMaxPosAroundCars() {
        return this.cars.stream()
                .max((a, b) -> a.getPos() - b.getPos())
                .orElseThrow(() -> new RuntimeException("게임을 확인해주세요"))
                .getPos();
    }
}
