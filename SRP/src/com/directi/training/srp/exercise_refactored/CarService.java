package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class CarService
{
    private final CarRepository _repository;

    public CarService(CarRepository repository)
    {
        _repository = repository;
    }

    public Car getBestCar()
    {
        List<Car> cars = _repository.findAll();
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
