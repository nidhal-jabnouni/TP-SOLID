package com.directi.training.srp.exercise_refactored;

import java.util.List;

public class Client
{
    public static void main(String[] args)
    {
        // Initialize dependencies
        CarRepository repository = new InMemoryCarRepository();
        CarFormatter formatter = new CarFormatter();
        CarService service = new CarService(repository);

        // Display all car names
        List<Car> allCars = repository.findAll();
        String carsNames = formatter.formatCarNames(allCars);
        System.out.println("All Cars: " + carsNames);

        // Display best car
        Car bestCar = service.getBestCar();
        if (bestCar != null) {
            System.out.println("Best Car: " + formatter.formatCarName(bestCar));
        }

        // Display car by ID
        Car carById = repository.findById("2");
        if (carById != null) {
            System.out.println("Car with ID 2: " + formatter.formatCarName(carById));
        }
    }
}
