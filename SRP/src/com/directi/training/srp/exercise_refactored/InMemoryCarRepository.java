package com.directi.training.srp.exercise_refactored;

import java.util.Arrays;
import java.util.List;

public class InMemoryCarRepository implements CarRepository
{
    private final List<Car> _cars = Arrays.asList(
        new Car("1", "Golf III", "Volkswagen"),
        new Car("2", "Multipla", "Fiat"),
        new Car("3", "Megane", "Renault")
    );

    @Override
    public Car findById(String id)
    {
        for (Car car : _cars) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> findAll()
    {
        return _cars;
    }
}
