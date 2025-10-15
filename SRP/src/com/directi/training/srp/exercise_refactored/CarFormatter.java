package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarFormatter
{
    public String formatCarNames(List<Car> cars)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(formatCarName(car));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public String formatCarName(Car car)
    {
        return car.getBrand() + " " + car.getModel();
    }
}
